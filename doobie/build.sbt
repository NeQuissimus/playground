import Dependencies._
import Repositories._

name := "doobie"
version := "1.0.0-SNAPSHOT"
scalaVersion := Versions.scala

libraryDependencies ++= Seq(
    doobieCore, doobiePostgres
)

resolvers += sonatypeSnapshots

mainClass in Compile := None

wartremoverWarnings ++= Warts.unsafe
