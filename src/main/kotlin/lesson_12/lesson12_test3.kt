package ru.maxx52.lesson_12

fun main() {

    val weather = Weather3(301, 293, false)
    weather.printWeather()
}

class Weather3(
    tempDay: Int,
    tempNight: Int,
    isRain: Boolean,
) {
    private val tempDay = tempDay - KELVIN_TO_CELSIUM
    private val tempNight = tempNight - KELVIN_TO_CELSIUM
    val isRain = isRain

    fun printWeather() {
        println("Температура днём: $tempDay, температура ночью: $tempNight, наличие осадков: $isRain")
    }
}
const val KELVIN_TO_CELSIUM = 273