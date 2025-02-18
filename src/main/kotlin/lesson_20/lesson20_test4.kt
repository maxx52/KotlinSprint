package ru.maxx52.lesson_20

fun main() {

    val listString: List<String> = listOf("Weather", "Town", "River", "Out of there", "Nothing else matters")

    val printLambdas: List<() -> Unit> = listString.map { item ->
        { println("Нажат элемент: $item") }
    }

    printLambdas.forEachIndexed { index, printLambda ->
        if (index % 2 == 0) {
            printLambda()
        }
    }
}