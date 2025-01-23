package ru.maxx52.lesson_4

fun main() {

    // Исходные данные:
    val bookingToday = 13
    val bookingTomorrow = 9

    // Создаем переменные с результатами сравнения:
    val freeToday = bookingToday < MAX_TABLES
    val freeTomorrow = bookingTomorrow < MAX_TABLES

    // Вывод результата:
    println("Доступность столиков на сегодня: $freeToday,\nДоступность столиков на завтра: $freeTomorrow")

}
// Общее кол-во столиков:
const val MAX_TABLES = 13