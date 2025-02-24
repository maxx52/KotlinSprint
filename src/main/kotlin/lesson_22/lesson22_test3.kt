package ru.maxx52.lesson_22

fun main() {

    val note = Notebook("Acer", 8, 32)

    val (name, coresOfProcessor, ram) = note

    println("Название ноутбука: \"$name\"")
    println("Количество ядер процессора: $coresOfProcessor")
    println("Объём оперативной памяти: $ram Гб")
}

data class Notebook(
    val name: String,
    val coresOfProcessor: Int,
    val ram: Int,
)