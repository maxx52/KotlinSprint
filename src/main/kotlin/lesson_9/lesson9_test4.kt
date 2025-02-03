package ru.maxx52.lesson_9

fun main() {
    println("Ввод ингредиентов")

    println("Введите 5 ингредиентов через запятую и пробел: ")
    val ingredientInput = readln()

    if (ingredientInput.isBlank()) {
        println("Список не должен быть пустым!")
        return
    }

    val ingredientList = ingredientInput.split(",")
        .map { it.trim() }
        .filter { it.isNotEmpty() }

    if (ingredientList.size < 5) {
        println("Пожалуйста, введите не менее 5 ингредиентов")
        return
    }

    val newList = ingredientList.sorted()
    println("Получился следующий список ингредиентов: ${newList.joinToString(", ")}")
}