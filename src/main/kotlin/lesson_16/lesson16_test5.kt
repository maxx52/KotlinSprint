package ru.maxx52.lesson_16

const val DEFAULT_HEALTH = 100

fun main() {
    val player = User("Maxx", 20)

    println(player)

    player.getDamage(30)
    println(player)

    player.getDamage(50)
    println(player)

    player.getDamage(30)
    println(player)

    player.heal(20)
    println(player)
}

class User(
    val name: String,
    var force: Int,
) {
    private var health: Int = DEFAULT_HEALTH

    fun getDamage(damage: Int) {
        if (!isDead()) {
            health -= damage
            println("$name получает $damage урона! Текущее здоровье: $health")
            if (isDead()) {
                die()
            }
        } else {
            println("$name мертв и не может получать урон!")
        }
    }

    fun heal(amount: Int) {
        if (!isDead()) {
            health += amount
            println("$name лечится на $amount! Текущее здоровье: $health")
        } else {
            println("$name мертв и не может исцеляться!")
        }
    }

    private fun die() {
        health = 0
        force = 0
        println("$name умер!")
    }

    private fun isDead(): Boolean {
        return health <= 0
    }

    override fun toString(): String {
        return "$name: здоровье = $health, сила удара = $force"
    }
}