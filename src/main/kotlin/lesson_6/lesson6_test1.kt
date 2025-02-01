package ru.maxx52.lesson_6

fun main() {

    println("Регистрация")

    println("Введите логин:")
    val loginReg = readln()

    println("Введите пароль:")
    val passwordReg = readln()

    var isAuthorized = false

    do {
        println("Авторизация")

        println("Введите логин:")
        val loginAuth = readln()

        println("Введите пароль:")
        val passwordAuth = readln()

        if (loginAuth == loginReg && passwordAuth == passwordReg) {
            println("Авторизация прошла успешно!")
            isAuthorized = true
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    } while (!isAuthorized)
}