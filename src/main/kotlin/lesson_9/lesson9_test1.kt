package ru.maxx52.lesson_9

fun main() {
    println("Список ингредиентов:")

    val ingredientList = listOf(
        "морковь",
        "лук",
        "томатная паста",
        "картофель",
        "специи"
    )

    if (ingredientList.isEmpty()) {
        println("Список ингредиентов пуст.")
    } else {
        println("В рецепте есть следующие ингредиенты: ${ingredientList.joinToString(", ")}")

        ingredientList.forEachIndexed { index, ingredient ->
            println("Ингредиент ${index + 1}: $ingredient")
        }
    }
}
