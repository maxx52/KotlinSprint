package ru.maxx52.lesson_4

fun main() {

    // Исходные данные:
    val weather = true
    val tent = true
    val humidity = 20
    val season = "winter"

    // Благоприятные условия:
    val comfortWeather = true
    val comfortTent = true
    val comfortHumidity = 20
    val comfortSeason = "no winter"

    // Сравнение текущих условий с благоприятными:
    val result = (weather == comfortWeather) &&
            (tent == comfortTent) && (humidity == comfortHumidity) &&
            (season == comfortSeason)

    // Вывод результата:
    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}