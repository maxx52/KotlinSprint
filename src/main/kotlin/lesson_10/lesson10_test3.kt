package ru.maxx52.lesson_10

const val PASSWORD_LENGTH = 6

fun main() {

    println("Password generator")

    val numbers = 0..9
    val special = ' '..'/'

    generatePassword(numbers, special)
}

fun generatePassword(numbers: IntRange, special: CharRange) {
    val sharedArray = (numbers + special)
    val password = StringBuilder()

    try {
        println("Введите требуемое количество символов, минимум 6:")
        val passwordLength = readln().toInt()

        if (passwordLength < PASSWORD_LENGTH) {
            println("Количество символов не может быть меньше 6")
        } else {
            val requiredNumber = numbers.random()
            val requiredSpecial = special.random()
            password.append(requiredNumber)
            password.append(requiredSpecial)

            for (i in 2 until  passwordLength) {
                val randomSymbol = sharedArray.random()
                password.append(randomSymbol)
            }

            println("Ваш пароль: $password")
        }
    } catch (e: NumberFormatException) {
        println("Неверный формат числа!")
    }
}