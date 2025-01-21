package ru.maxx52.lesson_3

fun main() {

    // Исходные данные:
    val step = "D2-D4;0"

    // Распарсим на составляющие:
    val startStep = step.split('-', ';')

    // Вывод результатов, функция split() возвращает List<String>,
    // поэтому к составляющим обращаюсь через индексы:
    println("Начало хода: ${startStep[0]}")
    println("Конец хода: ${startStep[1]}")
    println("Номер хода: ${startStep[2]}")
}