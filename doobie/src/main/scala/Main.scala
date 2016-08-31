import doobie.imports._

object Main {
    val xa = DriverManagerTransactor[IOLite]("org.postgresql.Driver", "jdbc:postgresql:world", "postgres", "")
    val test = "test"
}
