package ru.maxx52.lesson_15

fun main() {
    val guitar = Instrument("Гитара", 10)
    val strings = Components("Запасные струны", 20)

    guitar.addItem(strings)

    guitar.findItem("Запасные струны")
}

abstract class Items(
    val name: String,
    var count: Int,
)

class Instrument(
    name: String,
    count: Int,
) : Items(name, count), Search {
    private val componentsList = mutableListOf<Components>()

    fun addItem(component: Components) {
        componentsList.add(component)
        println("Добавлены комплектующие '${component.name}' к инструменту '$name'.")
    }

    override fun findItem(itemName: String) {
        println("Поиск: '$itemName' для инструмента '$name'.")
        val foundComponents = componentsList.filter { it.name.contains(itemName, ignoreCase = true) }
        if (foundComponents.isNotEmpty()) {
            println("Найдены комплектующие:")
            foundComponents.forEach {
                println("- ${it.name} (остаток на складе: ${it.count})")
            }
        } else {
            println("Комплектующее '$itemName' не найдено.")
        }
    }
}

class Components(
    name: String,
    count: Int,
) : Items(name, count)

interface Search {
    fun findItem(itemName: String)
}