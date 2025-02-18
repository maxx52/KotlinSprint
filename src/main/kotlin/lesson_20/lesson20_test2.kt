package ru.maxx52.lesson_20

fun main() {

    val player = Gamer("John", 80, 100)

    val restoreHealth: (Gamer) -> Unit = { gamer ->
        gamer.restoreHealth()
    }

    println("Текущее здоровье до использования зелья: ${player.currentHealth}")

    restoreHealth(player)

    println("Текущее здоровье после использования зелья: ${player.currentHealth}")
}

class Gamer(
    val name: String,
    var currentHealth: Int,
    private val maxHealth: Int
) {

    fun restoreHealth() {
        currentHealth = maxHealth
        println("$name восстановил здоровье до $currentHealth.")
    }
}