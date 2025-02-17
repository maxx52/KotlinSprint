package ru.maxx52.lesson_19

fun main() {
    val cloth = Production("Джинсы", 1, Category.CLOTH)
    val stationary = Production("Карандаш", 2, Category.STATIONARY)
    val different = Production("Пылесос", 3, Category.DIFFERENT)

    cloth.getInfo()
    stationary.getInfo()
    different.getInfo()
}

enum class Category(private val description: String) {
    CLOTH("Одежда"),
    STATIONARY("Канцелярские товары"),
    DIFFERENT("Разное");

    fun getDescription(): String {
        return description
    }
}

class Production(
    private val name: String,
    private val id: Int,
    private val category: Category,
) {
    fun getInfo() {
        println("$name, ID: $id, категория: ${category.getDescription()}")
    }
}