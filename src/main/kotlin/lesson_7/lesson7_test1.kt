package ru.maxx52.lesson_7

fun main() {

    println("Генератор паролей")

    val letters = 'a'..'z'
    val digits = '0'..'9'
    val passwordLength = 6
    var password = ""

    for (i in 0 .. passwordLength) {
        if (i % 2 == 0) {
            val randomLetter = letters.random()
            password += randomLetter
        } else {
            val randomDigit = digits.random()
            password += randomDigit
        }
    }
    println("Ваш пароль: $password")
}