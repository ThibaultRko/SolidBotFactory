package main.domain.weatherBot

import scala.concurrent.Future

case class WeatherRepository {
  def getLocalWeather(data: String): Future[Option[Weather]]
}
