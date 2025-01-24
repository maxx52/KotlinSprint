package ru.maxx52.lesson_4

fun main() {

    // Исходные данные:
    val weightFirst = 20
    val weightSecond = 50
    val volumeFirst = 80
    val volumeSecond = 100

    // Соответствие параметров первого груза:
    val comparisonFirst = weightFirst > AVERAGE_WEIGHT && volumeFirst < AVERAGE_VOLUME

    // Соответствие параметров второго груза:
    val comparisonSecond = weightSecond > AVERAGE_WEIGHT && volumeSecond < AVERAGE_VOLUME

    // Вывод сообщения:
    println("Груз с весом $weightFirst кг и объемом $volumeFirst л соответствует категории 'Average': $comparisonFirst")
    println("Груз с весом $weightSecond кг и объемом $volumeSecond л соответствует категории 'Average': $comparisonSecond")

    // Второй вариант вывода сообщения:
    val first = weightFirst > AVERAGE_WEIGHT && volumeFirst < AVERAGE_VOLUME
    val second = weightSecond > AVERAGE_WEIGHT && volumeSecond < AVERAGE_VOLUME
    println(buildString {
        append("Груз с весом ")
        append(weightFirst)
        append(" кг и объемом ")
        append(volumeFirst)
        append(" л соответствует категории 'Average': ")
        append(first)
    })
    println(buildString {
        append("Груз с весом ")
        append(weightSecond)
        append(" кг и объемом ")
        append(volumeSecond)
        append(" л соответствует категории 'Average': ")
        append(second)
    })
}
// Входные данные выносим в константы:
const val AVERAGE_WEIGHT = 35
const val AVERAGE_VOLUME = 100