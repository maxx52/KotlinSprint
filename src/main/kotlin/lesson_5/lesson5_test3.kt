package ru.maxx52.lesson_5

fun main() {

    // Исходные данные:
    val number1 = 5
    val number2 = 34

    println("Приветствуем вас в нашей лотерее! Нужно угадать два числа от 0 до 42")
    println("Введите первое число:")
    val userNumber1 = readln().toInt()

    println("Введите второе число:")
    val userNumber2 = readln().toInt()

    val result = if ((userNumber1 == number1 || userNumber1 == number2) &&
        (userNumber2 == number1 || userNumber2 == number2)) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if ((userNumber1 == number1 || userNumber1 == number2) ||
        (userNumber2 == number1 || userNumber2 == number2)) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }

    // Вывод результата:
    println(result)
}