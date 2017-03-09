import java.util

import com.google.gson.Gson
import org.apache.commons.httpclient.methods.PostMethod
import org.apache.commons.httpclient.{HttpClient, NameValuePair}


case class Person(firstName: String, lastName: String, age: Int)

object HttpJsonPostTest extends App {

  // create our object as a json string
  val spock = new Person("Leonard", "Nimoy", 82)
  val spockAsJson = new Gson().toJson(spock)

  // add name value pairs to a post object
  val post = new PostMethod("https://posttestserver.com/post.php")
  val nameValuePairs = new util.ArrayList[NameValuePair]()
  nameValuePairs.add(new NameValuePair("JSON", spockAsJson))
  val arr= new Array[NameValuePair](1)
  arr(0)=new NameValuePair("JSON", spockAsJson)
  post.setRequestBody(arr)
  // send the post request
  val client = new HttpClient()
  val response = client.executeMethod(post)
  println(response)

}