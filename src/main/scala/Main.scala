import hw.json._
import hw.wrangling.WranglingLike

object Wrangling extends WranglingLike {

  val data: List[Json] = JsonHelper.fromFile("yelp.json")

  def key(json: Json, key: String): Option[Json] = ???

  def fromState(data: List[Json], state: String): List[Json] = ???

  def ratingLT(data: List[Json], rating: Double): List[Json] = ???

  def ratingGT(data: List[Json], rating: Double): List[Json] = ???

  def category(data: List[Json], category: String): List[Json] = ???

  def groupByState(data: List[Json]): Map[String, List[Json]] = ???

  def groupByCategory(data: List[Json]): Map[String, List[Json]] = ???

  def bestPlace(data: List[Json]): Option[Json] = ???

  def hasAmbience(data: List[Json], ambience: String): List[Json] = ???

}
