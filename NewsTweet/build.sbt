name := """NewsTweet"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies += guice

libraryDependencies ++= Seq(
  ws
)

// https://mvnrepository.com/artifact/org.twitter4j/twitter4j-core
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.2"

// https://mvnrepository.com/artifact/javax.servlet/servlet-api
libraryDependencies += "javax.servlet" % "servlet-api" % "2.5" % "provided"

libraryDependencies ++= Seq(evolutions, jdbc)

libraryDependencies += "com.h2database" % "h2" % "1.4.192"

libraryDependencies ++= Seq(
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final", // replace by your jpa implementation
  filters,
"org.webjars" % "bootstrap" % "3.3.7-1" exclude("org.webjars", "jquery"),
"org.webjars" % "jquery" % "3.2.1"
)

// https://mvnrepository.com/artifact/javax.persistence/persistence-api
libraryDependencies += "javax.inject" % "javax.inject" % "1"

libraryDependencies += "javax.persistence" % "persistence-api" % "1.0"

// https://mvnrepository.com/artifact/junit/junit
libraryDependencies += "junit" % "junit" % "4.12" % Test


// https://mvnrepository.com/artifact/org.twitter4j/twitter4j-stream
libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "4.0.6"

libraryDependencies += "de.julielab" % "aliasi-lingpipe" % "4.1.0"

libraryDependencies += "com.adrianhurt" %% "play-bootstrap" % "1.2-P26-B4"