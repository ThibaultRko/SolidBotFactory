package main

trait RollingBot {
  def goForward(): Unit = {
    println("go forward")
  }
  def goReverse(): Unit = {
    println("go reverse")
  }
}
