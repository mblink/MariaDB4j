ThisBuild / organization := "ch.vorburger.mariaDB4j"
ThisBuild / version := "2.6.0-BL"
ThisBuild / scalaVersion := "2.13.9"

lazy val core = (project in file("mariaDB4j-core"))
  .settings(
    name := "mariaDB4j-core",
    libraryDependencies ++= List(
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5",
      "org.slf4j" % "slf4j-api" % "1.7.36",
      "ch.vorburger.exec" % "exec" % "3.1.3",
      "org.apache.commons" % "commons-lang3" % "3.12.0",
      "commons-io" % "commons-io" % "2.11.0",
      "org.springframework" % "spring-core" % "5.3.23",
    )
  )
