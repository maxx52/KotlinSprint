package ru.maxx52.lesson_6

fun main() {

    println("Регистрация")

    // Запрашиваем логин и пароль у пользователя для регистрации
    println("Введите логин:")
    val loginReg = readln()

    println("Введите пароль:")
    val passwordReg = readln()

    // Состояние авторизации пользователя:
    var isAuthorized = false

    // Запрашиваем логин и пароль для входа, пока они не совпадут:
    do {
        println("Авторизация")

        println("Введите логин:")
        val loginAuth = readln()

        println("Введите пароль:")
        val passwordAuth = readln()

        // Проверка на совпадение логина и пароля:
        if (loginAuth == loginReg && passwordAuth == passwordReg) {
            println("Авторизация прошла успешно!")
            isAuthorized = true // Меняем состояние на авторизации
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    } while (!isAuthorized)
}