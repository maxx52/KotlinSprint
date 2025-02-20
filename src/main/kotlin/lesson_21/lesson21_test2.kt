package ru.maxx52.lesson_21

fun main() {
    val numbers: List<IntRange> = listOf(1..50)

    println("Сумма четных чисел: ${numbers.evenNumbersSum()}")
}

fun List<IntRange>.evenNumbersSum(): Int = this.flatMap { it.toList() }.filter { it % 2 == 0 }.sum()