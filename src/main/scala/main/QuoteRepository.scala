package main
import scala.concurrent.Future

trait QuoteRepository {
  def getQuote(id: Int): Future[Option[Quote]]
  def getRandomQuote(): Future[Option[Quote]]
}