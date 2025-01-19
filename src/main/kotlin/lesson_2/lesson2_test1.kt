package ru.maxx52.lesson_2

fun main() {

    // Исходные данные задачи
    val student1 = 3.0
    val student2 = 4.0
    val student3 = 3.0
    val student4 = 5.0

    // Среднее арифметическое:
    val result: Double = (student1 + student2 + student3 + student4) / 4

    // Приведение к заданному формату
    val result1 = "%.2f".format(result)

    // Вывод результата в консоль:
    println("Средний бал: $result1")

}