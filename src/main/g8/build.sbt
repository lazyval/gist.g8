
organization := "$organization$"

name := "$name$"

// version is defined in version.sbt in order to support sbt-release

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "0.4.0",
  "org.scalaz" %% "scalaz-core" % "6.0.4",
  "org.specs2" %% "specs2" % "1.9" % "test",
  "org.scalacheck" %% "scalacheck" % "1.9" % "test",
  "org.mockito" % "mockito-all" % "1.9.0" % "test",
  "org.hamcrest" % "hamcrest-all" % "1.1" % "test"
)

initialCommands in console := "import $organization$._"

scalariformSettings
