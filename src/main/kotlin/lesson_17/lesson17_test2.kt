package ru.maxx52.lesson_17

fun main() {
    val ship = SpaceShip()

    println(ship)

    ship.name = "NewGalaxy"
    ship.speed = 750
    ship.port = "Milky Way"
    println("После изменений: $ship")
}

class SpaceShip(
    private val _name: String = "Galaxy",
    var speed: Int = 700,
    var port: String = "Andromeda",
) {
    var name: String = _name
        set(value) {
            field = "$name - имя изменить нельзя!"
        }

    override fun toString(): String {
        return "Корабль: $name, Средняя скорость: $speed, Порт приписки: $port"
    }
}