package ru.maxx52.lesson_17

fun main() {

    val customer = Customer("Alex", "Alex777")

    customer.login = "Dmitriy"

    customer.password = "Dmitriy555"

    println("Пароль: ${customer.password}")
}

class Customer(
    private var _login: String,
    private var _password: String,
) {
    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин пользователя успешно изменен на: $_login")
        }

    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}