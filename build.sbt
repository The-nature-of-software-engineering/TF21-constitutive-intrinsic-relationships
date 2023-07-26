ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

ThisBuild / crossScalaVersions ++= Seq("2.13.6", "3.0.0")

//addSbtPlugin("com.waioeka.sbt" % "cucumber-plugin" % "0.3.1")

//val specVersion = "5.2.0"

//libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % specVersion % "test")

val cucumberVersion = "8.16.0"
val cucumberJUnitVersion = "7.13.0"
libraryDependencies ++= Seq (
//  "io.cucumber" % "cucumber-core" % cucumberVersion % "test",
  "io.cucumber" %% "cucumber-scala" % cucumberVersion % "test",
//  "io.cucumber" % "cucumber-jvm" % cucumberVersion % "test",
  "io.cucumber" % "cucumber-junit" % cucumberJUnitVersion % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

//enablePlugins(CucumberPlugin)

lazy val root = (project in file("."))
  .settings(
    name := "TF28-constitutive-intrinsic-relationships",
    idePackagePrefix := Some("dev.accelerated.DTF")
  )
