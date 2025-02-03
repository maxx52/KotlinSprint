package ru.maxx52.lesson_9

import java.util.*

fun main() {

    println("Ввод ингредиентов")

    val counter = 5
    val ingredientList = mutableListOf<String>()

    while (ingredientList.size < counter) {
        val counterElements = ingredientList.size

        println("Введите ингредиент ${counterElements + 1}: ")
        val ingredientInput = readln().trim()

        if (ingredientInput.isBlank()) {
            println("Название ингредиента не может быть пустым!")
        } else {
            ingredientList += ingredientInput
        }
    }
    val newList = ingredientList.sorted()
    println("Получился следующий список ингредиентов: ${newList.joinToString(", ")
        .replaceFirstChar { 
            if (it.isLowerCase()) {
                it.titlecase(Locale.getDefault())
            } else {
                it.toString()
            }
        }}") // Это предложила сама IDEA вместо .capitalize()
}