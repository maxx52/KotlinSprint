package ru.maxx52.lesson_10

fun main() {
    println("Игра в кости")

    var userWins = 0
    var computerWins = 0
    var draws = 0

    do {
        val result = roundDice()
        when (result) {
            "user" -> {
                println("Победило человечество!")
                userWins++
            }
            "computer" -> {
                println("Победила машина!")
                computerWins++
            }
            "draw" -> {
                println("Победила дружба!")
                draws++
            }
        }

        println("Текущий счет - Человечество: $userWins, Машина: $computerWins, Дружба: $draws")

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val selectUser = readln()
    } while (selectUser.equals("да", ignoreCase = true))
}

fun rollDice(): Int = (1..6).random()

fun roundDice(): String {
    val userDice = rollDice()
    val computerDice = rollDice()

    println("Вы бросили: $userDice, Компьютер бросил: $computerDice")

    return when {
        userDice > computerDice -> "user"
        userDice < computerDice -> "computer"
        else -> "draw"
    }
}