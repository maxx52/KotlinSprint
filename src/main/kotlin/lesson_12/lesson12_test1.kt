package ru.maxx52.lesson_12

fun main() {

    println("Отслеживание погоды по дням")

    val yesterday = Weather()
    yesterday.tempDay = 25
    yesterday.tempNight = 20
    yesterday.printWeather()

    val today = Weather()
    today.tempDay = 22
    today.tempNight = 17
    today.isRain = true
    today.printWeather()

}

class Weather {
    var tempDay = 28
    var tempNight = 18
    var isRain = false

    fun printWeather() {
        println("Температура днём: $tempDay, температура ночью: $tempNight, наличие осадков: $isRain")
    }
}