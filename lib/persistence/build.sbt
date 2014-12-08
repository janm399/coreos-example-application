import Dependencies._

Project.settings

name := "persistence"

libraryDependencies ++= Seq(
  // Core Akka
  akka.actor,
  akka.contrib,
  akka.persistence_cassandra,
  akka.remote,
  akka.slf4j,
  // Miscellaneous
  commons,
  etcd,
  guava,
  logback,
  typesafe,
  // Testing
  scalatest     % "test",
  akka.testkit  % "test"
)
