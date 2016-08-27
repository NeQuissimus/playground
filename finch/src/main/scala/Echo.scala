import io.finch._
import io.finch.circe._
import com.twitter.finagle.Http
import com.twitter.util.Await
import io.circe.generic.auto._
import java.nio.charset.StandardCharsets

case class Echo(val param: String)

object Echo extends App {
  val api = get("echo" :: string) { (s: String) => Ok(Echo(s)) } withCharset StandardCharsets.UTF_8
  Await.ready(Http.server.serve(":8080", api.toServiceAs[Application.Json]))
}