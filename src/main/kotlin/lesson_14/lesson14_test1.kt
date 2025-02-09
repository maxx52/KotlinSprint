package ru.maxx52.lesson_14

fun main() {

    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    liner.printShip()
    cargoShip.printShip()
    icebreaker.printShip()
}

abstract class Ship(
    protected val name: String,
    protected val speed: Int,
    protected val capacity: Int,
    protected val passengers: Int,
) {
    open fun printShip() {
        println("Корабль $name: скорость $speed, грузоподъёмность $capacity, пассажиров $passengers")
    }
}

class Liner(
    name: String = "Лайнер",
    speed: Int = 15,
    capacity: Int = 200,
    passengers: Int = 1000,
) : Ship(name, speed, capacity, passengers)

class CargoShip(
    name: String = "Грузовой",
    speed: Int = 10,
    capacity: Int = 1000,
    passengers: Int = 100,
) : Ship(name, speed, capacity, passengers)

class Icebreaker(
    name: String = "Ледокол",
    speed: Int = 8,
    capacity: Int = 800,
    passengers: Int = 250,
    private val isBreakIce: Boolean = true,
) : Ship(name, speed, capacity, passengers) {
    override fun printShip() {
        println("Корабль $name: скорость $speed, грузоподъёмность $capacity, пассажиров $passengers, может колоть лёд: $isBreakIce")
    }
}