import Dependencies._

name := "finch"
version := "1.0.0-SNAPSHOT"
scalaVersion := Versions.scala

libraryDependencies ++= Seq(
    finchCore, finchCirce,
    circeCore, circeGeneric, circeParser
)

mainClass in Compile := Some("Echo")

wartremoverWarnings ++= Warts.unsafe
