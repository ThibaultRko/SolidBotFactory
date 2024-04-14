package main

import main.domain.philoBot.PhiloBot

object Main extends App {
  val quoteRepository = new JsonQuoteRepository()
  val platoBot = new PhiloBot(quoteRepository)
  platoBot.myNameIs("PlatoBot")
  platoBot.sayQuote()
}

