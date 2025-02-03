package ru.maxx52.lesson_8

fun main() {

    println("Создание списка(массива) ингредиентов")

    println("Введите количество ингредиентов:")
    val indexInput = readln().toInt()

    val ingredientList: Array<String?> = arrayOfNulls(indexInput)

    println("Вводите ингредиенты по одному:")

    for (i in ingredientList.indices) {
        println("Введите ингредиент ${i + 1}:")
        val ingredientInput = readln()
        ingredientList[i] = ingredientInput
    }

    println("Новый список ингредиентов: ${ingredientList.joinToString(", ")}")
}
