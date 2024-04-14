package main

import main.domain.philoBot.{Quote, QuoteRepository}

import scala.io.Source
import scala.util.Random
import play.api.libs.json._

import scala.concurrent.Future

class JsonQuoteRepository extends QuoteRepository {
  implicit val quoteReads: Reads[Quote] = Json.reads[Quote]
  private val quotes: Seq[Quote] = {
    val json = Source.fromFile("src/main/scala/Main/database/DataSource.json").mkString
    Json.parse(json).as[Seq[Quote]]
  }

  def getQuote(id: Int): Future[Option[Quote]] = Future.successful {
    quotes.find(_.id == id)
  }

  def getRandomQuote(): Future[Option[Quote]] = Future.successful {
    if (quotes.isEmpty) None
    else Some(quotes(Random.nextInt(quotes.size)))
  }
}
