package ru.maxx52.lesson_2

fun main() {

    println("Задача 4 к Уроку 2")

    // Исходные данные:
    val crystalOre = 7
    val ironOre = 11
    val baff = 20

    // Вычисление кол-ва руды, полученной в результате баффа:
    val crystalBaff = crystalOre - crystalOre * PERCENT / (PERCENT + baff)
    val ironBaff = ironOre - ironOre * PERCENT / (PERCENT + baff)

    // Вывод результата:
    println("Получено кристаллической руды сверх нормы: $crystalBaff")
    println("Получено железной руды сверх нормы: $ironBaff")
}
// Для вычисления процентов вводим константу 100%
const val PERCENT = 100