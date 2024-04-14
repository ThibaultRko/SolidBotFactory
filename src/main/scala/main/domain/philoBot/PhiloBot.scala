package main.domain.philoBot

import main.domain.SolidBot

import scala.concurrent.ExecutionContext.Implicits.global

case class PhiloBot (quoteRepository: QuoteRepository) extends SolidBot{
  def sayQuote(): Unit = {
    quoteRepository.getRandomQuote().map {
      case Some(quote: Quote) => println(s"${quote.author} said: ${quote.citation}")
      case None => println("No quote found")
    }
  }
}
