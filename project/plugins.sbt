import sbt.Keys._

logLevel := Level.Warn

// Formatter for scala.
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "0.3.1")

// Check style plugin
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14")

// ensime
addSbtPlugin("org.ensime" % "sbt-ensime" % "1.9.1")
