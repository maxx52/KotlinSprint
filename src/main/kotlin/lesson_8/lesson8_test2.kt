package ru.maxx52.lesson_8

fun main() {

    println("Ингредиенты")

    val ingredientsList = listOf("картофель", "рис", "курица", "лук", "овощная смесь")

    println("Введите искомый ингредиент:")
    val ingredientInput = readln()

    var isIngredient = false

    for (ingredient in ingredientsList) {
        if (ingredient == ingredientInput) {
            isIngredient = true
            break
        }
    }

    if (isIngredient) {
        println("Ингредиент $ingredientInput в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}