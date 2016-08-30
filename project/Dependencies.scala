import sbt._

object Dependencies {
    lazy val circeCore = "io.circe" %% "circe-core" % Versions.circe
    lazy val circeGeneric = "io.circe" %% "circe-generic" % Versions.circe
    lazy val circeParser = "io.circe" %% "circe-parser" % Versions.circe
    lazy val doobieCore = "org.tpolecat" %% "doobie-core-cats" % Versions.doobie
    lazy val doobiePostgres = "org.tpolecat" %% "doobie-postgres-cats" % Versions.doobie
    lazy val finchCore = "com.github.finagle" %% "finch-core" % Versions.finch
    lazy val finchCirce = "com.github.finagle" %% "finch-circe" % Versions.finch
}

object Versions {
    lazy val circe = "0.5.0-M2"
    lazy val doobie = "0.3.1-SNAPSHOT"
    lazy val finch = "0.11.0-M2"
    lazy val scala = "2.11.8"
}

object Repositories {
    lazy val sonatypeSnapshots = Resolver.sonatypeRepo("snapshots")
}
