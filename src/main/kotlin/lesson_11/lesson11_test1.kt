package ru.maxx52.lesson_11

fun main() {

    println("Класс с данными пользователя")

    val user1 = User(1, "manager", "123456", "mail@mail.com")
    val user2 = User(2, "admin", "qwerty", "admin@mail.com")

    user1.printUser()
    user2.printUser()

}

class User(
    private val id: Int,
    private val login: String,
    private val password: String,
    private val email: String,
) {
    fun printUser() {
        println("Пользователь: id: $id, логин: $login, пароль: $password, e-mail: $email")
    }
}