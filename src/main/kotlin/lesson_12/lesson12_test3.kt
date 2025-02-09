package ru.maxx52.lesson_12

fun main() {

    val weather = Weather5(301, 293, false)
    weather.printWeather()
}

class Weather5(
    tempDay: Int,
    tempNight: Int,
    isRain: Boolean,
) {
    private val tempDay = tempDay - TO_CELSIUM
    private val tempNight = tempNight - TO_CELSIUM
    val isRain = isRain

    fun printWeather() {
        println("Температура днём: $tempDay, температура ночью: $tempNight, наличие осадков: $isRain")
    }
}
const val TO_CELSIUM = 273