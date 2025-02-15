package ru.maxx52.lesson_16

fun main() {

    val user = User7("Maxx")

    println("Здравствуйте, ${user.login}, ведите пароль:")
    try {
        val passwordInput: String = readln().trim()
        println("Правильность пароля: ${user.validatePassword(passwordInput)}")
    } catch (e: NullPointerException) {
        println("Пароль не должен быть пустым!")
    }
}

class User7(
    val login: String,
) {
    private val password: String = "KotlinSprint"
    fun validatePassword(passwordInput: String): Boolean {
        return passwordInput == password
    }
}