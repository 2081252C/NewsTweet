# TwitterUsers schema

# --- !Ups

CREATE TABLE twitter_user (
    id INTEGER NOT NULL,
    username varchar(255) NOT NULL,
    access_token varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE twitter_user;