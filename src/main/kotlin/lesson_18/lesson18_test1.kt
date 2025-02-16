package ru.maxx52.lesson_18

fun main() {
    val order1 = Order(1)
    order1.addGoods("Товар A")

    val order2 = Order(2)
    order2.addGoods(listOf("Товар B", "Товар C", "Товар D"))

    order1.displayOrderInfo()
    order2.displayOrderInfo()
}

class Order(
    private val orderNumber: Int
) {
    private var items: List<String> = emptyList()

    fun addGoods(name: String) {
        items = listOf(name)
    }

    fun addGoods(names: List<String>) {
        items = names
    }

    fun displayOrderInfo() {
        when {
            items.size == 1 -> println("Заказ номер $orderNumber: Заказан товар: ${items[0]}")
            items.size > 1 -> println("Заказ номер $orderNumber: Заказаны следующие товары: ${items.joinToString(", ")}")
            else -> println("Заказ номер $orderNumber: Нет товаров в заказе.")
        }
    }
}