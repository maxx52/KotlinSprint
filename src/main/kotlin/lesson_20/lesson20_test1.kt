package ru.maxx52.lesson_20

fun main() {

    val printString: (String) -> Unit = {
        println("С наступающим Новым Годом, $it!")
    }
    printString("Maxx")
}