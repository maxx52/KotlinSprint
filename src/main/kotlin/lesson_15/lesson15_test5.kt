package ru.maxx52.lesson_15

const val MAX_WEIGHT = 2
const val MAX_PASSENGERS_SEDAN = 3
const val MAX_PASSENGERS_CARGO = 1

fun main() {

    val sedan1 = Sedan("Toyota")
    val sedan2 = Sedan("BMW")

    sedan1.loadPassengers(2)
    sedan2.loadPassengers(3)

    val truck1 = Truck("Volvo")
    val truck2 = Truck("Scania")
    truck1.loadCargo(1)
    truck2.loadCargo(1)
    truck1.loadPassengers(1)

    sedan1.unloadPassengers()
    sedan2.unloadPassengers()
    truck1.unloadPassengers()
    truck1.unloadCargo()
    truck2.unloadPassengers()
    truck2.unloadCargo()
}

abstract class Car {
    abstract val name: String
}

class Sedan(
    override val name: String,
): Car(), TransPassengers {

    private var currentPassengers = 0

    override fun loadPassengers(passengers: Int): Int {
        if (currentPassengers + passengers > MAX_PASSENGERS_SEDAN) {
            println("В машине $name нет мест для $passengers пассажиров.")
        } else {
            currentPassengers += passengers
            println("В машину $name село $passengers пассажиров.")
        }
        return currentPassengers
    }

    override fun unloadPassengers(): Int {
        if (currentPassengers <= 0) {
            println("В машине $name нет пассажиров")
        } else {
            println("Из машины $name вышло $currentPassengers пассажиров.")
            currentPassengers = 0
        }
        return currentPassengers
    }
}

class Truck(
    override val name: String,
) : Car(), TransCargo, TransPassengers {

    private var currentCargo = 0
    private var currentPassengers = 0

    override fun loadCargo(cargo: Int): Int {
        if (currentCargo + cargo > MAX_WEIGHT) {
            println("В машину $name невозможно загрузить $cargo тонн.")
        } else {
            currentCargo += cargo
            println("В машину $name загружено $cargo тонн груза.")
        }
        return currentCargo
    }

    override fun unloadCargo(): Int {
        if (currentCargo <= 0) {
            println("В машине $name нет груза для выгрузки.")
        } else {
            println("Из машины $name выгружено $currentCargo тонн груза.")
            currentCargo = 0
        }
        return currentCargo
    }

    override fun loadPassengers(passengers: Int): Int {
        if (currentPassengers + passengers > MAX_PASSENGERS_CARGO) {
            println("В машине $name нет мест для $passengers пассажиров.")
        } else {
            currentPassengers += passengers
            println("В машину $name село $passengers пассажиров.")
        }
        return currentPassengers
    }

    override fun unloadPassengers(): Int {
        if (currentPassengers <= 0) {
            println("В машине $name нет пассажиров")
        } else {
            println("Из машины $name вышло $currentPassengers пассажиров.")
            currentPassengers = 0
        }
        return currentPassengers
    }
}

interface TransCargo {
    fun loadCargo(cargo: Int): Int
    fun unloadCargo(): Int
}

interface TransPassengers {
    fun loadPassengers(passengers: Int): Int
    fun unloadPassengers(): Int
}