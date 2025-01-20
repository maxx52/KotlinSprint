package ru.maxx52.lesson_4

fun main() {

    // Исходные данные:
    val averageWeight = 35
    val averageVolume = 100
    val weightFirst = 20
    val weightSecond = 50
    val volumeFirst = 80
    val volumeSecond = 100

    // Соответствие параметров первого груза:
    val comparisonFirst = weightFirst > averageWeight && volumeFirst < averageVolume

    // Соответствие параметров второго груза:
    val comparisonSecond = weightSecond > averageWeight && volumeSecond < averageVolume

    // Вывод сообщения:
    println("Груз с весом $weightFirst кг и объемом $volumeFirst л соответствует категории 'Average': $comparisonFirst")
    println("Груз с весом $weightSecond кг и объемом $volumeSecond л соответствует категории 'Average': $comparisonSecond")

    // Второй вариант вывода сообщения:
    println("Груз с весом $weightFirst кг и объемом $volumeFirst л соответствует категории 'Average': ${weightFirst > averageWeight && volumeFirst < averageVolume}")
    println("Груз с весом $weightSecond кг и объемом $volumeSecond л соответствует категории 'Average': ${weightSecond > averageWeight && volumeSecond < averageVolume}")


}