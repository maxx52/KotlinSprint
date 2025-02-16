package ru.maxx52.lesson_17

fun main() {
    val delivery = Package(1)

    println("Текущая локация: ${delivery.currentLocation}")
    delivery.currentLocation = Location.PLACE_B.description
    println("Текущая локация после замены: ${delivery.currentLocation}, кол-во перемещений ${delivery.moveCount}")
}

class Package(
    private val number: Int,
    private var location: String = Location.PLACE_A.description,
) {
    var moveCount = 0

    var currentLocation: String
        get() = location
        set(value) {
            if (number == this.number) {
                location = Location.PLACE_B.description
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