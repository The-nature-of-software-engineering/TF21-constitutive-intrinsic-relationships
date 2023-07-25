ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

ThisBuild / crossScalaVersions ++= Seq("2.13.6", "3.0.0")

val specVersion = "5.2.0"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % specVersion % "test")

lazy val root = (project in file("."))
  .settings(
    name := "TF28-constitutive-intrinsic-relationships",
    idePackagePrefix := Some("dev.accelerated.DTF")
  )
