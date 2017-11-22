package models;

import com.google.inject.ImplementedBy;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

/**
 * This interface provides a non-blocking API for possibly blocking operations.
 */
@ImplementedBy(JPATwitterUserRepository.class)
public interface TwitterUserRepository {

    CompletionStage<TwitterUser> add(TwitterUser twitterUser);

    CompletionStage<Stream<TwitterUser>> list();
}