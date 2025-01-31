package ru.maxx52.lesson_6

fun main() {

    println("Таймер")

    // Запрашиваем у пользователя кол-во секунд:
    println("Введите количество секунд для обратного отсчёта:")
    val secondsInput = readln()
    do {
        try {
            // Проверка числа на положительность:
            var seconds = secondsInput.toInt()
            if (seconds <= 0) {
                println("Введите положительное число больше нуля")
            } else {
                // Включаем обратный отсчет:
                while (seconds > 0) {
                    seconds--
                    Thread.sleep(MILLIS)
                }
                // По окончании времени выводим сообщение:
                println("Прошло $secondsInput сек")
            }
        } catch (e: NumberFormatException) {
            println("Введите корректное целое число!")
        }
    } while (secondsInput == null) // если пользователь ничего не ввел, выходим из программы
}
// Кол-во миллисекунд в секунде:
const val MILLIS = 1000L