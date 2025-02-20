package ru.maxx52.lesson_21

fun main() {
    val player = Player("John", 80, 100)

    println("Здоровье игрока равно максимальному? - ${player.isHealth()}")

    val restoreHealth: (Player) -> Unit = { p ->
        p.restoreHealth()
    }

    restoreHealth(player)
    println("Здоровье игрока равно максимальному? - ${player.isHealth()}")
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
) {
    fun restoreHealth() {
        currentHealth = maxHealth
        println("$name восстановил здоровье до $maxHealth")
    }
}

fun Player.isHealth(): Boolean = currentHealth == maxHealth