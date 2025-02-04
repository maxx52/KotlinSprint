package ru.maxx52.lesson_10

fun main() {

    println("Валидация логина и пароля")

    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    validateUser(userLogin, userPassword)
}
const val MINIMUM_SYMBOLS = 4
fun validateUser(userLogin: String, userPassword: String) {
    if (userLogin.length < MINIMUM_SYMBOLS || userPassword.length < MINIMUM_SYMBOLS) {
        println("Логин или пароль недостаточно длинные")
    }
}