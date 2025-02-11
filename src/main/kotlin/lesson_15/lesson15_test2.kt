package ru.maxx52.lesson_15

fun main() {

    val temperature = Temperature(25, 18)
    val precipitation = PrecipitationAmount(false)

    val weatherServer = WeatherServer()
    weatherServer.sendServer(temperature)
    weatherServer.sendServer(precipitation)
}

abstract class WeatherStationStats

class Temperature(
    private val tempDay: Int,
    private val tempNight: Int,
) : WeatherStationStats() {
    fun getTemperatureInfo(): String {
        return "Температура: Дневная - $tempDay, Ночная - $tempNight"
    }
}

class PrecipitationAmount(
    private val isRain: Boolean,
) : WeatherStationStats() {
    fun getPrecipitationInfo(): String {
        return if (isRain) {
            "Осадки: Дождь"
        } else {
            "Осадки: Без дождя"
        }
    }
}

class WeatherServer {
    fun sendServer(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> {
                println(stats.getTemperatureInfo())
            }
            is PrecipitationAmount -> {
                println(stats.getPrecipitationInfo())
            }
        }
    }
}