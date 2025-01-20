package ru.maxx52.lesson_2

fun main() {

    println("Задача 3 к Уроку 2")

    // Исходные данные
    val leaveTrainHour = 9
    val leaveTrainMinutes = 39
    val time = 457

    // Вычисление результата:
        // Переведём время отправления в минуты от начала дня:
    val leaveTrainTime = leaveTrainHour * MINUTES_IN_HOUR + leaveTrainMinutes
    val resultTime = leaveTrainTime + time
    val resultHours = resultTime / MINUTES_IN_HOUR
    val resultMinutes = resultTime % resultHours

    // Вывод результата:
    println("Время прибытия поезда: %02d:%02d".format(resultHours, resultMinutes))

}
const val MINUTES_IN_HOUR = 60