package ru.maxx52.lesson_3

fun main() {

    // Исходные данные:
    var start = "E2"
    var end = "E4"
    var step = 1

    // Формирование строки для отправки или вывода:
    var resultStep = "Белые ходят %s - %s, ход №%d".format(start, end, step)
    println(resultStep)

    // Данные для второго хода
    start = "D2"
    end = "D3"
    step++

    // Формирование строки для отправки или вывода:
    resultStep = "Белые ходят %s - %s, ход №%d".format(start, end, step)
    println(resultStep)
}