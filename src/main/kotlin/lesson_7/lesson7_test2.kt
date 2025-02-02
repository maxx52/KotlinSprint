package ru.maxx52.lesson_7

fun main() {

    println("Авторизация по коду из СМС")

    do {
        try {
            val code = (1000..9999).random()
            println("Ваш код авторизации: $code")

            println("Чтобы авторизоваться, введите код из СМС:")
            val checkCode = readln().toInt()
            if (checkCode != code) {
                println("Неверный код, попробуйте ещё раз")
            } else {
                println("Добро пожаловать!")
                break
            }
        } catch (e: NumberFormatException) {
            println("Неверный формат числа!")
        }
    } while (true)
}