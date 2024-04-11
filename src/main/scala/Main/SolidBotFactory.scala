package Main

import scala.concurrent.ExecutionContext.Implicits.global

object SolidBotFactory extends App {

  trait WalkingBot {
    def walking(): Unit = {
      println("I walk")
    }
    def running(): Unit = {
      println("I run")
    }
  }
  trait RollingBot {
    def goForward(): Unit = {
      println("go forward")
    }
    def goReverse(): Unit = {
      println("go reverse")
    }
  }

  abstract class SolidBot(quoteRepository: QuoteRepository) {
    def myRegisterIs(register: Int): Unit = {
      println(s"my register is $register")
    }

    def myNameIs(name: String): Unit = {
      println(s"my name is $name")
    }

    def SayQuote(): Unit = {
      quoteRepository.getRandomQuote().map {
        case Some(quote: Quote) => println(s"${quote.author} said: ${quote.citation}")
        case None => println("No quote found")
      }
    }
  }

  class Worker(quoteRepository: QuoteRepository) extends SolidBot(quoteRepository) with WalkingBot {
    def job(): Unit = {
      println("i'm a worker")
    }
  }

  class Warrior(quoteRepository: QuoteRepository) extends SolidBot(quoteRepository) with WalkingBot {
    def job(): Unit = {
      println("i'm a warrior")
    }
  }

  class Transporter(quoteRepository: QuoteRepository) extends SolidBot(quoteRepository) with RollingBot {
    def job(): Unit = {
      println("I'm a transporter")
    }
  }






  val jsonQuoteRepository = new JsonQuoteRepository
  val warBot: Warrior = new Warrior(quoteRepository = jsonQuoteRepository)
  warBot.myNameIs("Roger")
  warBot.myRegisterIs(24)
  warBot.job()
  warBot.running()
  warBot.SayQuote()
}
