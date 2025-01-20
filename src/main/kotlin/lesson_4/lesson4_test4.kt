package ru.maxx52.lesson_4

fun main() {

    // Исходные данные:
    val dayNumber = 5
    val arms = dayNumber % 2 == 0
    val press = dayNumber % 2 == 0
    val legs = dayNumber % 2 != 0
    val back = dayNumber % 2 != 0

    // Вывод результата:
    println("""
        Упражнения для рук:     $arms
        Упражнения для ног:     $legs
        Упражнения для спины:   $back
        Упражнения для пресса:  $press
    """.trimIndent())

}