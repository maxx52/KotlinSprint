package ru.maxx52.lesson_7

fun main() {

    println("Таймер с циклом for")

    try {
        println("Введите количество секунд:")
        val secondsInput = readln().toInt()

        if (secondsInput < 0) {
            println("Число должно быть положительным!")
            return
        }

        for (i in secondsInput downTo 1) {
            println("Осталось $i секунд")
            Thread.sleep(1000)
        }

        println("Время вышло.")
    } catch (e: NumberFormatException) {
        println("Неверный формат числа!")
    }
}
