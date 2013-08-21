name := "Scala-Koans"

version := "1.0"

scalaVersion := "2.10.2"

// append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

// disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.RC1-SNAP4" % "test" withSources() withJavadoc()