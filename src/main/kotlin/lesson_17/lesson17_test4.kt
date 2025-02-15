package ru.maxx52.lesson_17

fun main() {
    val delivery = Package(1)

    println("Текущая локация: ${delivery.currentLocation}")
    delivery.replace(1)
    println("Текущая локация после замены: ${delivery.currentLocation}, кол-во перемещений ${delivery.moveCount}")
    delivery.replace(2)
}

class Package(
    private val number: Int,
    private var _location: String = Location.PLACE_A.description,
) {
    var moveCount = 0

    val currentLocation: String
        get() = _location

    fun replace(number: Int) {
        if (number == this.number) {
            _location = Location.PLACE_B.description
            moveCount++
            println("Посылка $number перемещена в $currentLocation")
        } else {
            println("Номер посылки не найден")
        }
    }
}

enum class Location(val description: String) {
    PLACE_A("сортировочный центр"),
    PLACE_B("пункт выдачи заказов");

    override fun toString(): String {
        return description
    }
}