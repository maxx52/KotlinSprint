package ru.maxx52.lesson_7

fun main() {
    println("Вывод чётных чисел")

    println("Введите число:")
    try {
        val numberInput = readln().toInt()
        val progression = 0..numberInput step 2
        val result = StringBuilder()

        for (i in progression) {
            result.append(i).append(" ")
        }

        println("Полученный ряд чисел: ${result.trim()}")
    } catch (e: NumberFormatException) {
        println("Неверный формат числа!")
    }
}
