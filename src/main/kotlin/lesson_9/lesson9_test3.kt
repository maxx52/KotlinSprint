package ru.maxx52.lesson_9

fun main() {

    println("Расчет кол-ва ингредиентов")

    val ingredientList = listOf(2, 50, 15)

    println("Введите количество порций:")
    val portionInput: Int

    try {
        portionInput = readln().toInt()

        if (portionInput <= 0) {
            println("Число порций должно быть положительным!")
        } else {
            val newList = ingredientList.map {
                it * portionInput
            }

            val result = StringBuilder()

            println(result.append("На $portionInput порций вам понадобится: ")
                .append("Яиц – ${newList[0]} шт., ")
                .append("молока – ${newList[1]} мл., ")
                .append("сливочного масла – ${newList[2]} гр.")
            )
        }
    } catch (e: NumberFormatException) {
        println("Введите корректное число!")
    }
}