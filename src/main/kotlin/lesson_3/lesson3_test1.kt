package ru.maxx52.lesson_3

fun main() {

    // Объявляем переменные
    val welcomeDay = "день"
    val welcomeEvening = "вечер"
    val userName = "Lord"

    // Вывод приветствия
    println("Добрый %s, $userName".format(welcomeDay))
    println("Добрый %s, $userName".format(welcomeEvening))

}