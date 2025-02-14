package ru.maxx52.lesson_16

private const val PI = 3.14

fun main() {

    val round = Round(4)
    round.square()
    round.length()
}

class Round(
    private val radius: Int,
) {
    fun square() {
        println("Площадь круга: ${PI * radius * radius}")
    }

    fun length() {
        println("Длина окружности: ${2 * PI * radius}")
    }
}