package ru.maxx52.lesson_5

fun main() {

    // Инициализируем переменные
    val number1 = (Math.random() * 10).toInt()
    val number2 = (Math.random() * 10).toInt()

    println("Авторизация")
    println("Чтобы войти, введите результат сложения двух чисел: %d, %d".format(number1, number2))
    val input = readln().toInt()
    if (input == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }

}