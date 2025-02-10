package ru.maxx52.lesson_14

fun main() {

    val liner = Liner2()
    val cargoShip = CargoShip2()
    val icebreaker = Icebreaker2()

    liner.printShip()
    cargoShip.printShip()
    icebreaker.printShip()
}

abstract class Ship2(
    private val name: String,
    private val speed: Int,
    private val capacity: Int,
    private val passengers: Int,
    private val loading: String,
) {
    open fun printShip() {
        println(getShipInfo())
    }

    protected fun getShipInfo(): String {
        return "Корабль $name: скорость $speed, грузоподъёмность $capacity, пассажиров $passengers, способ погрузки: $loading"
    }
}

class Liner2(
    name: String = "Лайнер",
    speed: Int = 15,
    capacity: Int = 200,
    passengers: Int = 1000,
    loading: String = "выдвигает горизонтальный трап со шкафута",
) : Ship2(name, speed, capacity, passengers, loading)

class CargoShip2(
    name: String = "Грузовой",
    speed: Int = 10,
    capacity: Int = 1000,
    passengers: Int = 100,
    loading: String = "активирует погрузочный кран",
) : Ship2(name, speed, capacity, passengers, loading)

class Icebreaker2(
    name: String = "Ледокол",
    speed: Int = 8,
    capacity: Int = 800,
    passengers: Int = 250,
    private val isBreakIce: Boolean = true,
    loading: String = "открывает ворота со стороны кормы",
) : Ship2(name, speed, capacity, passengers, loading) {
    override fun printShip() {
        println("${getShipInfo()}, может колоть лёд: $isBreakIce")
    }
}