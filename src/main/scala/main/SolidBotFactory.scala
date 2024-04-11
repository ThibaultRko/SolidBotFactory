package main

import scala.concurrent.ExecutionContext.Implicits.global

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

