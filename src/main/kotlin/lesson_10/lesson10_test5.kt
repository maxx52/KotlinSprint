package ru.maxx52.lesson_10

const val USERNAME = "admin"
const val PASSWORD = "password"

fun main() {
    println("Добро пожаловать в интернет-магазин!")
    println("Введите логин:")
    val usernameInput = readln().trim()

    println("Введите пароль:")
    val passwordInput = readln().trim()
    val token = userAuth(usernameInput, passwordInput)

    if (token != null) {
        println("Авторизация успешна! Ваш токен: $token")

        val cart = getCart(token)
        if (cart != null) {
            println("Содержимое корзины: $cart")
        } else {
            println("Не удалось получить корзину.")
        }
    } else {
        println("Неудачная авторизация. Проверьте логин и пароль.")
    }
}

fun userAuth(username: String, password: String): String? {
    return if (username == USERNAME && password == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return (1..32)
        .map { chars.random() }
        .joinToString("")
}

fun getCart(token: String): List<String>? {
    return if (token.length == 32) {
        listOf("Товар 1", "Товар 2", "Товар 3")
    } else {
        null
    }
}