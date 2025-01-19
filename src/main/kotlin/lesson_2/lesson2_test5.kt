package ru.maxx52.lesson_2

fun main() {

    println("Задача 5* к Уроку 2")

    // Исходные данные
    val year = 20 // срок вклада
    val sum = 70000 // сумма вклада
    val percent = 16.7 // процентная ставка

    // Расчет сложного процента:
    val result = sum * (1 + percent * year * 365 / 365 * 100) * 20
    val result1 = "%.3f".format(result)

    // Вывод результата
    println("Сумма вклада в конце периода составит: $result1 рублей")

}