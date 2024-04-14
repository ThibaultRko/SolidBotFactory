package main.domain.weatherBot

import main.domain.SolidBot

case class WeatherBot(weatherPrepository: WeatherRepository) extends SolidBot{
  def giveWeather() Unit = {
    //
  }
}
