package ru.maxx52.lesson_12

import kotlin.random.Random

const val ABS_NULL = 273
const val DAYS_IN_MONTH = 30
const val TEMP_30 = ABS_NULL + DAYS_IN_MONTH

fun main() {

    val weatherList = mutableListOf<Weather4>()
    for (i in 1..DAYS_IN_MONTH) {
        val weather = Weather4()
        weatherList.add(weather)
    }
    val averageDayTemp = weatherList.averageDay()
    val averageNightTemp = weatherList.averageNight()
    val countRainy = weatherList.countRainyDays()

    println("Средняя дневная температура: $averageDayTemp")
    println("Средняя ночная температура: $averageNightTemp")
    println("Количество дней с осадками: $countRainy")
}

class Weather4() {
    val tempDay = InputData().getTempDay()
    val tempNight = InputData().getTempNight()
    val isRain: Boolean = InputData().getIsRain()
}

class InputData {
    private val tempDay: Int = (ABS_NULL..TEMP_30).random() - ABS_NULL
    private val tempNight: Int = (ABS_NULL..TEMP_30).random() - ABS_NULL
    private var isRain: Boolean = getIsRain()

    fun getTempDay(): Int {
        return tempDay
    }

    fun getTempNight(): Int {
        return tempNight
    }

    fun getIsRain(): Boolean {
        isRain = Random.nextBoolean()
        return isRain
    }
}
fun List<Weather4>.averageDay(): Double {
    return this.map { it.tempDay }.average()
}

fun List<Weather4>.averageNight(): Double {
    return this.map { it.tempNight }.average()
}

fun List<Weather4>.countRainyDays(): Int {
    return this.count { it.isRain }
}