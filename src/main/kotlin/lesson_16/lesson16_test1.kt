package ru.maxx52.lesson_16

fun main() {

    val number = Cube()
    number.getNumber()
}

class Cube(
    private val number: Int = (1..6).random(),
) {
    fun getNumber() {
        println("Выпало число $number")
    }
}