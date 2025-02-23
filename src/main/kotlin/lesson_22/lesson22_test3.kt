package ru.maxx52.lesson_22

fun main() {

    val note = Notebook("Acer", 8, 32)
    println("Название ноутбука: \"${note.name}\"")
    println("Количество ядер процессора: ${note.coresOfProcessor}")
    println("Объём оперативной памяти: ${note.ram} Гб")
}

data class Notebook(
    val name: String,
    val coresOfProcessor: Int,
    val ram: Int,
)