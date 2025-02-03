package ru.maxx52.lesson_9

fun main() {
    println("Пополняемый список ингредиентов")

    val ingredientList = mutableListOf("творог", "сахар", "изюм")
    println("В рецепте есть базовые ингредиенты: ${ingredientList.joinToString(", ")}")

    println("Желаете добавить ещё? (да / нет)")
    val permissionInput = readln().trim()

    if (permissionInput.equals("нет", ignoreCase = true)) {
        println("До свидания!")
        return
    } else if (permissionInput.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотели бы добавить?")
        val ingredientInput = readln().trim()

        if (ingredientInput.isBlank()) {
            println("Название ингредиента не может быть пустым!")
        } else if (ingredientList.contains(ingredientInput)) {
            println("Ингредиент '$ingredientInput' уже есть в списке!")
        } else {
            ingredientList += ingredientInput
            println("Теперь в рецепте есть следующие ингредиенты: ${ingredientList.joinToString(", ")}")
        }
    } else {
        println("Неизвестный ответ! Пожалуйста, введите 'да' или 'нет'.")
    }
}