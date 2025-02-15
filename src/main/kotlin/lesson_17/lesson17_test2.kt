package ru.maxx52.lesson_17

fun main() {
    val ship = SpaceShip("Galaxy", 700, "Andromeda")

    println(ship)

    ship.changeName("NewGalaxy")
    println(ship)

    ship.speed = 750
    ship.port = "Milky Way"
    println("После изменений: $ship")
}

class SpaceShip(
    private val _name: String,
    var speed: Int,
    var port: String
) {
    var name: String = ""
        get() = _name

    override fun toString(): String {
        return "Корабль: $name, Средняя скорость: $speed, Порт приписки: $port"
    }

    fun changeName(newName: String) {
        println("Имя корабля $name не может быть изменено")
    }
}