package main.domain

abstract class SolidBot() {
  def myRegisterIs(register: Int): Unit = {
    println(s"my register is $register")
  }

  def myNameIs(name: String): Unit = {
    println(s"my name is $name")
  }
}