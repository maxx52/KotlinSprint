package ru.maxx52.lesson_18

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val listAnimals: List<Tamagochy> = listOf(fox, dog, cat)

    listAnimals.forEach { animal ->
        println(animal.toEat())
    }
}

open class Tamagochy(
    open val name: String
) {
    open fun toEat(): String {
        return name
    }
}

class Fox(
    override val name: String
) : Tamagochy(name) {
    override fun toEat(): String {
        return "$name -> ест ягоды."
    }
}

class Dog(
    override val name: String
) : Tamagochy(name) {
    override fun toEat(): String {
        return "$name -> ест кости."
    }
}

class Cat(
    override val name: String
) : Tamagochy(name) {
    override fun toEat(): String {
        return "$name -> ест рыбу."
    }
}