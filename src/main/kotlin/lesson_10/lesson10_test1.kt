package ru.maxx52.lesson_10

fun main() {

    println("Игра в кости")

    val userDice = rollDice()
    val computerDice = rollDice()

    println("Счет $userDice : $computerDice")

    if (userDice > computerDice) {
        println("Победило человечество!")
    } else if (userDice < computerDice) {
        println("Победила машина!")
    } else {
        println("Победила дружба!")
    }
}

//fun rollDice(): Int = (1..6).random()