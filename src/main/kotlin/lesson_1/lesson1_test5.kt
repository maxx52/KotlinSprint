package ru.maxx52.lesson_1

fun main() {

    // Объявляем исходную переменную:
    val seconds = 6480

    // Получаем кол-во минут
    val minutes = seconds / MINUTE_IN_HOUR

    // Получаем кол-во часов и записываем в новую переменную:
    val hours = minutes / MINUTE_IN_HOUR

    val remainingMinutes = minutes % MINUTE_IN_HOUR
    val remainingSeconds = seconds % MINUTE_IN_HOUR

    // Вывод результата в консоль:
    println("%02d:%02d:%02d".format(hours, remainingMinutes, remainingSeconds))
}
// Объявляем константы, чтобы избежать путаницы в программе
const val MINUTE_IN_HOUR = 60