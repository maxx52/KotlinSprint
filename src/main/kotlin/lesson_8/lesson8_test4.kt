package ru.maxx52.lesson_8

fun main() {

    println("Список ингредиентов:")

    val ingredientsList = mutableListOf(
        "картофель",
        "рис",
        "курица",
        "лук",
        "овощная смесь",
    )

    for (ingredient in ingredientsList) {
        println(ingredient)
    }

    println("Какой ингредиент вы хотели бы заменить?")
    val findIngredient = readln()

    val indexChange = ingredientsList.indexOf(findIngredient)

    if (indexChange == -1) {
        println("Такого ингредиента нет в списке!")
    } else {
        println("Введите ингредиент для замены:")
        val changeIngredient = readln()

        if (changeIngredient.isBlank()) {
            println("Ингредиент для замены не может быть пустым!")
        } else {
            ingredientsList[indexChange] = changeIngredient
            println("Готово! Вы сохранили следующий список: ${ingredientsList.joinToString(", ")}")
        }
    }
}