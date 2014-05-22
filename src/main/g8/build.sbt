organization := "$organization$"

name := "$name$"

// version is defined in version.sbt in order to support sbt-release

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xlint")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.0" % "test"
)

initialCommands in console := "import $organization$._"


scalaSource in Compile := baseDirectory.value

scalaSource in Test := baseDirectory.value

javaSource in Compile := baseDirectory.value

javaSource in Test := baseDirectory.value

resourceDirectory in Compile := baseDirectory.value

resourceDirectory in Test := baseDirectory.value