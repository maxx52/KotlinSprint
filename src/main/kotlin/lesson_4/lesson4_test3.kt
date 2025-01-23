package ru.maxx52.lesson_4

fun main() {

    // Благоприятные условия:
    val comfortWeather = true
    val comfortTent = true
    val comfortHumidity = 20
    val comfortSeason = "winter"

    // Сравнение текущих условий с благоприятными:
    val result = (IS_SUNNY == comfortWeather) &&
            (IS_AWNING_OPEN == comfortTent) &&
            (HUMIDITY == comfortHumidity) &&
            (SEASON != comfortSeason)

    // Вывод результата:
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}
// Исходные данные заносим в константы:
const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"