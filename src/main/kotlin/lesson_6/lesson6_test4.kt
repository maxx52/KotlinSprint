package ru.maxx52.lesson_6

fun main() {

    println("Угадайте число от 1 до 9")

    val number = (1..9).random()
    var counter = 5

    try {
        while (counter > 0) {
            println("Введите число:")
            val numberInput = readln().toInt()

            if (numberInput != number) {
                counter--
                if (counter > 0) {
                    println("Неверно, у вас осталось $counter попыток")
                } else {
                    println("Вы проиграли. Было загадано число $number")
                }
            } else {
                println("Это была великолепная игра!")
                break
            }
        }
    } catch (e: NumberFormatException) {
        println("Введите корректное число")
    }
}