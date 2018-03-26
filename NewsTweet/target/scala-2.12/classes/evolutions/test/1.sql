# --- !Ups

create table interest (
  id                            bigint auto_increment not null,
  interest_name                 varchar(255),
  persona_id                    bigint,
  constraint pk_interest primary key (id)
);

create table persona (
  id                            bigint auto_increment not null,
  persona_name                  varchar(255),
  twitter_user_id               bigint not null,
  constraint pk_persona primary key (id)
);

create table twitter_user (
  id                            bigint not null,
  username                      varchar(255),
  img_url                       varchar(255),
  access_token                  varchar(255),
  access_token_secret           varchar(255),
  constraint pk_twitter_user primary key (id)
);

create table track (
  id                            bigint auto_increment not null,
  tracked_term                  varchar(255),
  tweets_as_string              varchar(max),
  interest_id                   bigint not null,
  constraint pk_track_interest primary key (id)
);

alter table interest add constraint fk_interest_persona_id foreign key (persona_id) references persona (id) on delete restrict on update restrict;
create index ix_interest_persona_id on interest (persona_id);

alter table persona add constraint fk_persona_twitter_user_id foreign key (twitter_user_id) references twitter_user (id) on delete restrict on update restrict;
create index ix_persona_twitter_user_id on persona (twitter_user_id);

alter table track add constraint fk_track_interest_id foreign key (interest_id) references interest (id) on delete restrict on update restrict;
create index ix_track_interest_id on track (interest_id);


# --- !Downs

alter table interest drop constraint if exists fk_interest_persona_id;
drop index if exists ix_interest_persona_id;

alter table persona drop constraint if exists fk_persona_twitter_user_id;
drop index if exists ix_persona_twitter_user_id;

drop table if exists interest;

drop table if exists persona;

drop table if exists twitter_user;


