package ru.maxx52.lesson_6

fun main() {

    println("Таймер")

    println("Введите количество секунд для обратного отсчёта:")
    val secondsInput = readln()
    do {
        try {
            val seconds = secondsInput.toInt()
            if (seconds <= 0) {
                println("Введите положительное число больше нуля")
            } else {
                Thread.sleep(seconds * MILLIS_1)
                println("Прошло $secondsInput сек")
            }
        } catch (e: NumberFormatException) {
            println("Введите корректное целое число!")
        }
    } while (secondsInput == null)
}
const val MILLIS_1 = 1000L