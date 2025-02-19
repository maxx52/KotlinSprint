package ru.maxx52.lesson_20

fun main() {

    val player = Gamer("John", 80, 100)

    val restoreHealth: (Gamer) -> Unit = { gamer ->
        gamer.restoreHealth()
    }

    println("Текущее здоровье до использования зелья: ${player.currentHealth}")

    restoreHealth(player)

    println("Текущее здоровье после использования зелья: ${player.maxHealth}")
}

class Gamer(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
    val restoreHealth: () -> Unit = { println("$name восстановил здоровье до $maxHealth") }
)