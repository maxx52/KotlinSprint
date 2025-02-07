package ru.maxx52.lesson_10

fun main() {

    println("Валидация логина и пароля")

    println("Введите логин:")
    val userLogin = readln().trim()

    println("Введите пароль:")
    val userPassword = readln().trim()

    if (validateUser(userLogin, userPassword)) {
        println("Добро пожаловать!")
    } else {
        println("Длина логина и/или пароля менее $MINIMUM_SYMBOLS символов")
    }
}
const val MINIMUM_SYMBOLS = 4
fun validateUser(userLogin: String, userPassword: String): Boolean {
    val isValid = userLogin.length >= MINIMUM_SYMBOLS && userPassword.length >= MINIMUM_SYMBOLS
    return isValid
}