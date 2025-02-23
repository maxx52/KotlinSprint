package ru.maxx52.lesson_22

fun main() {

    val regBook = RegularBook2("Тайна жёлтой комнаты", "Гастон Леру")
    val dataBook = DataBook2("Библия", "Бог")

    println(regBook) // в панель выводится ссылка на класс объекта
    println(dataBook) // в панель выводится метод toString класса DataBook
}

class RegularBook2(
    name: String,
    author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)