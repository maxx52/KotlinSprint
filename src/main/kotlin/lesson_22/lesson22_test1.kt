package ru.maxx52.lesson_22

fun main() {

    val regBook1 = RegularBook("Тайна жёлтой комнаты", "Гастон Леру")
    val regBook2 = RegularBook("Тайна жёлтой комнаты", "Гастон Леру")
    val dataBook1 = DataBook("Библия", "Бог")
    val dataBook2 = DataBook("Библия", "Бог")

    val equal1 = regBook1.equals(dataBook1) // сравниваются ссылки на объекты в памяти, а не значения
    val equal2 = regBook2.equals(dataBook2)

    println(equal1)
    println(equal2)
}

class RegularBook(
    name: String,
    author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)