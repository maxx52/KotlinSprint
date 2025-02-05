package ru.maxx52.lesson_9

fun main() {
    println("Пополняемый список ингредиентов")

    val ingredientList = listOf("творог", "сахар", "изюм").toMutableSet()
    println("В рецепте есть базовые ингредиенты: ${ingredientList.joinToString(", ")}")

    try {
        println("Желаете добавить ещё? (да / нет)")
        val permissionInput = readln().trim()

        if (permissionInput.equals("да", ignoreCase = true)) {
            println("Какой ингредиент вы хотели бы добавить?")
            val ingredientInput = readln().trim()

            ingredientList.add(ingredientInput)
            println("Теперь в рецепте есть следующие ингредиенты: ${ingredientList.joinToString(", ")}")
        } else {
            println("До свидания!")
        }
    } catch (e: NullPointerException) {
        println("Название ингредиента не может быть пустым!")
    }
}