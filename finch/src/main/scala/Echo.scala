import io.finch._
import io.finch.circe._
import com.twitter.finagle.Http
import com.twitter.util.Await
import io.circe.generic.auto._

case class Hello(val world: String)

object Echo extends App {
  val api = get("hello") { Ok(Hello("World")) }
  Await.ready(Http.server.serve(":8080", api.toServiceAs[Application.Json]))
}