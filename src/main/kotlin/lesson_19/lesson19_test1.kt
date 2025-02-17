package ru.maxx52.lesson_19

fun main() {

    println("Вы можете добавить в ваш аквариум следующие виды рыб:")
    Fishes.entries.forEach { fish ->
        println(fish)
    }
}

enum class Fishes(private val description: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");

    override fun toString(): String {
        return description
    }
}