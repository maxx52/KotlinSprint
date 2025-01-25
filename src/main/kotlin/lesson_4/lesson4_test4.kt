package ru.maxx52.lesson_4

fun main() {

    // Исходные данные:
    val day = 5
    val isEven = day % 2 == 0

    // Вывод результата:
    println("""
        Упражнения для рук:     $isEven
        Упражнения для ног:     ${!isEven}
        Упражнения для спины:   ${!isEven}
        Упражнения для пресса:  $isEven
    """.trimIndent())

}