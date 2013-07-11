
organization := "$organization$"

name := "$name$"

// version is defined in version.sbt in order to support sbt-release

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.0.2"
  "org.specs2" %% "specs2" % "2.0" % "test"
)

initialCommands in console := "import $organization$._"
