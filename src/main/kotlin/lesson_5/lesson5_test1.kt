package ru.maxx52.lesson_5

fun main() {

    // Инициализируем переменные
    val number1 = ((1..10).random() * 10)
    val number2 = ((1..10).random() * 10)

    println("Авторизация")
    println("Чтобы войти, введите результат сложения двух чисел: %d, %d".format(number1, number2))
    val input = readln().toInt()
    if (input == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }

}