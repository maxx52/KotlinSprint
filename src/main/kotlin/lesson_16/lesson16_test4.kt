package ru.maxx52.lesson_16

fun main() {
    val order = Order(12345)

    println("Текущий статус заказа: ${order.getStatus()}")

    order.sendQuery(Status.READY)
    println("Статус после изменения: ${order.getStatus()}")

    order.sendQuery(Status.DELIVERY)
    println("Статус после изменения: ${order.getStatus()}")
}

class Order(
    private val number: Int,
) {
    private var status: Status = Status.CREATED

    fun changeStatus(newStatus: Status) {
        status = newStatus
    }

    fun getStatus(): String {
        return status.toString()
    }

    fun sendQuery(newStatus: Status) {
        println("Запрос менеджеру на изменение статуса заказа $number на '${newStatus}'")
        changeStatus(newStatus)
    }
}

enum class Status(val description: String) {
    CREATED("Заказ создан"),
    READY("Заказ собран, готовится к отправке"),
    DELIVERY("Заказ передан в доставку");

    override fun toString(): String {
        return description
    }
}