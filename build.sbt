lazy val core = (project in file(".")).settings(
  organization := "tf.bug",
  name := "puyix",
  version := "0.1.0",
  scalaVersion := "2.12.6",
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Ypartial-unification"),
  libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-core" % "1.2.0",
    "org.typelevel" %% "cats-effect" % "1.0.0-RC2",
    "io.monix" %% "monix" % "3.0.0-RC1",
    "org.typelevel" %% "spire" % "0.16.0",
    "org.scalactic" %% "scalactic" % "3.0.5",
    "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  ),
)

resolvers ++= Seq(
  "Typesafe Repository @ Dependencies" at "https://repo.typesafe.com/typesafe/releases/",
  "Artima Maven Repository @ Dependencies" at "http://repo.artima.com/releases/",
)
