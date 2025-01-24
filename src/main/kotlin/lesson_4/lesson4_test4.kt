package ru.maxx52.lesson_4

fun main() {

    // Исходные данные:
    val isEven = 5
    val bodyPart = isEven % 2 == 0

    // Вывод результата:
    println("""
        Упражнения для рук:     $bodyPart
        Упражнения для ног:     ${!bodyPart}
        Упражнения для спины:   ${!bodyPart}
        Упражнения для пресса:  $bodyPart
    """.trimIndent())

}