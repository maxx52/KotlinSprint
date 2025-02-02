package ru.maxx52.lesson_8

fun main() {

    println("Ингредиенты")

    val ingredientsList = listOf("картофель", "рис", "курица", "лук", "овощная смесь")

    println("Введите искомый ингредиент:")
    val ingredientInput = readln()

    if (ingredientInput in ingredientsList) {
        println("Ингредиент $ingredientInput в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}