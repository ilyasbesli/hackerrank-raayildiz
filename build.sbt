import sbt.Keys._

name := "hackerrank-scala"
organization := "me.rayyildiz"
version := "1.0"
scalaVersion := "2.11.8"

scalafmtConfig in ThisBuild := Some(file(".scalafmt"))

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
