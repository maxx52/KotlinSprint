package ru.maxx52.lesson_7

fun main() {

    println("Password generator Advanced")

    val numbers = 0..9
    val lettersLowercase = 'a'..'z'
    val lettersUppercase = 'A'..'Z'
    val sharedArray = (numbers + lettersLowercase + lettersUppercase)
    val password = StringBuilder()

    try {
        println("Введите требуемое количество символов, минимум 6:")
        val passwordLength = readln().toInt()

        if (passwordLength < 6) {
            println("Количество символов не может быть меньше 6")
        } else {
            val requiredNumber = numbers.random()
            val requiredLowercase = lettersLowercase.random()
            val requiredUppercase = lettersUppercase.random()
            password.append(requiredNumber)
            password.append(requiredUppercase)
            password.append(requiredLowercase)

            for (i in 0 until  passwordLength) {
                val randomSymbol = sharedArray.random()
                password.append(randomSymbol)
            }

            println("Ваш пароль: $password")
        }
    } catch (e: NumberFormatException) {
        println("Неверный формат числа!")
    }
}