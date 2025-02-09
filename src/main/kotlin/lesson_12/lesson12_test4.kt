package ru.maxx52.lesson_12

fun main() {

    val weather = Weather5(301, 293, false)
}

class Weather3(
    tempDay: Int,
    tempNight: Int,
    isRain: Boolean,
) {
    val tempDay = tempDay - TO_CELSIUM
    val tempNight = tempNight - TO_CELSIUM
    val isRain = isRain

    init {
        println("Температура днём: ${this.tempDay}, температура ночью: ${this.tempNight}, наличие осадков: ${this.isRain}")
    }
}
const val KELVIN_TO_CELSIUM = 273