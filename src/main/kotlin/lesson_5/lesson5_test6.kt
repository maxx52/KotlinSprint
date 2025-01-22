package ru.maxx52.lesson_5

import kotlin.math.pow

fun main() {

    println("Калькулятор ИМТ")

    println("Введите ваш вес, кг:")
    val weight = readln().toFloat()

    println("Введите ваш рост, см:")
    val height = readln().toFloat()

    // Переводим сантиметры в метры:
    val heightUser = height / SM_IN_METER

    // Расчет ИМТ:
    val imt = weight / heightUser.pow(2)

    // Сравнение полученных результатов:
    val result = if (imt < LOW) {
        "недостаточная масса тела"
    } else if (imt >= LOW && imt < MEDIUM) {
        "нормальная масса тела"
    } else if (imt >= MEDIUM && imt < HIGH) {
        "избыточная масса тела"
    } else {
        "ожирение"
    }

    // Вывод результатов:
    println("Ваш ИМТ %.2f, что говорит о том, что у вас %s".format(imt, result))

}
const val SM_IN_METER = 100
const val LOW = 18.5
const val MEDIUM = 25
const val HIGH = 30