package ru.maxx52.lesson_21

fun main() {
    val player1 = MainHero("Warrior", 40, 70, 25)
    val player2 = MainHero("Ranger", 70, 90, 10)
    val player3 = MainHero("Wizard", 100, 80, 100)

    val skills1 = player1.getSkills()
    val skills2 = player2.getSkills()
    val skills3 = player3.getSkills()

    println("${player1.name} - Максимальный навык: ${skills1.maxCategory()}")
    println("${player2.name} - Максимальный навык: ${skills2.maxCategory()}")
    println("${player3.name} - Максимальный навык: ${skills3.maxCategory()}")
}

class MainHero(
    val name: String,
    private val craft: Int,
    private val fight: Int,
    private val healing: Int,
) {
    fun getSkills(): Map<String, Int> {
        return mapOf(
            "Craft" to craft,
            "Fight" to fight,
            "Healing" to healing
        )
    }
}

fun Map<String, Int>.maxCategory(): String? = this.maxByOrNull { it.value }?.key