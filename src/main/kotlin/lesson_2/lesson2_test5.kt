package ru.maxx52.lesson_2

fun main() {

    println("Задача 5* к Уроку 2")

    // Исходные данные
    val year = 20 // срок вклада
    val sum = 70000 // сумма вклада
    val percent = 16.7 // процентная ставка

    // Расчет сложного процента:
    val result = sum * (1 + percent * year * DAY_IN_YEAR / DAY_IN_YEAR * FULL_PERCENT) * year

    // Вывод результата
    println("Сумма вклада в конце периода составит: %.3f рублей".format(result))
}
// ВВодим константы кол-ва дней в году и 100%
const val DAY_IN_YEAR = 365
const val FULL_PERCENT = 100