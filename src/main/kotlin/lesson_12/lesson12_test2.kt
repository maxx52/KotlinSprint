package ru.maxx52.lesson_12

fun main() {

    val weatherToday = Weather2(25, 18, true)
    weatherToday.printWeather()
}
class Weather2(
    private var tempDay: Int,
    private var tempNight: Int,
    private var isRain: Boolean,
) {
    fun printWeather() {
        println("Температура днём: $tempDay, температура ночью: $tempNight, наличие осадков: $isRain")
    }
}