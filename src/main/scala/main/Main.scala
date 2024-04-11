package main

object Main extends App {
  val quoteRepository = new JsonQuoteRepository()
  val worker = new Worker(quoteRepository)
  val warrior = new Warrior(quoteRepository)
  val transporter = new Transporter(quoteRepository)
  worker.job()
  worker.running()
}

