package ru.maxx52.lesson_6

fun main() {

    println("Докажите, что вы не бот")

    val number1 = (1..9).random()
    val number2 = (1..9).random()
    val sum = number1 + number2

    var counter = 3
    while (counter > 0) {
        try {
            println("Решите математический пример: $number1 + $number2")
            val numberInput = readln().toInt()

            if (numberInput != sum) {
                counter--
                if (counter > 0) {
                    println("Неверно, у вас осталось попыток: $counter")
                } else {
                    println("Доступ запрещен!")
                }
            } else {
                println("Добро пожаловать!")
                return
            }
        } catch (e: NumberFormatException) {
            println("Неверный формат числа")
        }
    }
}