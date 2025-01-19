package ru.maxx52.lesson_2

fun main() {

    println("Задача 3 к Уроку 2")

    // Исходные данные
    val leaveTrainHour = 9
    val leaveTrainMinutes = 39
    val time = 457

    // Кол-во часов в пути:
    val hour = 457 / 60
    // Кол-во минут в пути:
    val minutes = time % hour

    // Вычисление результата:
    val resultHours = leaveTrainHour + hour
    val resultMinutes = leaveTrainMinutes + minutes

    // Вывод результата:
    println("Время прибытия поезда: $resultHours : $resultMinutes")

}