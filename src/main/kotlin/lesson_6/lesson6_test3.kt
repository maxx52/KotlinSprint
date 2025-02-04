package ru.maxx52.lesson_6

fun main() {

    println("Таймер")

    println("Введите количество секунд для обратного отсчёта:")
    val secondsInput = readln()
    do {
        try {
            var seconds = secondsInput.toInt()
            if (seconds <= 0) {
                println("Введите положительное число больше нуля")
            } else {
                while (seconds > 0) {
                    println("Осталось секунд: ${seconds--}")
                    Thread.sleep(MILLIS)
                }
                println("Время вышло")
            }
        } catch (e: NumberFormatException) {
            println("Введите корректное целое число!")
        }
    } while (secondsInput == null)
}
const val MILLIS = 1000L