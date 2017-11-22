package models;

import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * Provide JPA operations running inside of a thread pool sized to the connection pool
 */
public class JPATwitterUserRepository implements TwitterUserRepository {

    private final JPAApi jpaApi;
    private final DEC executionContext;

    @Inject
    public JPATwitterUserRepository(JPAApi jpaApi, DEC executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<TwitterUser> add(TwitterUser twitterUser) {
        return supplyAsync(() -> wrap(em -> insert(em, twitterUser)), executionContext);
    }

    @Override
    public CompletionStage<Stream<TwitterUser>> list() {
        return supplyAsync(() -> wrap(em -> list(em)), executionContext);
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private TwitterUser insert(EntityManager em, TwitterUser twitterUser) {
        em.persist(twitterUser);
        return twitterUser;
    }

    private Stream<TwitterUser> list(EntityManager em) {
        List<TwitterUser> twitterUsers = em.createQuery("select u from TwitterUser u", TwitterUser.class).getResultList();
        return twitterUsers.stream();
    }
}