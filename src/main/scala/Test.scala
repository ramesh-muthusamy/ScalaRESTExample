import javax.print.DocFlavor.URL

/**
  * Created by Ramesh Muthusamy on 09-03-2017.
  */
object Test extends App {
println(scala.io.Source.fromURL("https://vuidtest.myvisualiq.com/vuid/partnermanagement/list").mkString)
  val url= new URL("https://vuidtest.myvisualiq.com/vuid/partnermanagement/list")
}
