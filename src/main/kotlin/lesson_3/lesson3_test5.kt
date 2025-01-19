package ru.maxx52.lesson_3

fun main() {

    // Исходные данные:
    val step = "D2-D4;0"

    // Распарсим на составляющие:
    val startStep = "${step[0]}${step[1]}"
    val endStep = "${step[3]}${step[4]}"

    // Номер хода может быть не только однозначным числом,
    // поэтому всё, что после знака ";" записываем в переменную
    val numberOfStep = step.substringAfter(";")

    // Вывод результатов:
    println("Начало хода: $startStep")
    println("Конец хода: $endStep")
    println("Номер хода: $numberOfStep")
}