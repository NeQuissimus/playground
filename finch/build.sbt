name := "finch"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core",
  "com.github.finagle" %% "finch-circe"
 ).map(_ % "0.11.0-M2")

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % "0.5.0-M2")

mainClass in Compile := Some("Echo")

wartremoverWarnings ++= Warts.unsafe
