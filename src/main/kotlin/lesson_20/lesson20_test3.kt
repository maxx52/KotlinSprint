package ru.maxx52.lesson_20

fun main() {

    val gamer1 = Gamer2(true)
    val gamer2 = Gamer2(false)

    val openDoor: (Gamer2) -> String = { gamer ->
        if (gamer.isKey) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    println(openDoor(gamer1))
    println(openDoor(gamer2))
}

class Gamer2(
    val isKey: Boolean,
)