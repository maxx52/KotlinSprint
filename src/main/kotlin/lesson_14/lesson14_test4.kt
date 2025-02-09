package ru.maxx52.lesson_14

fun main() {
    val planet = Planet("Abalon", isAtmosphere = true, forLanding = true)

    val satellite1 = Satellite("Ikarus", isAtmosphere = false, forLanding = true)
    val satellite2 = Satellite("Reya", isAtmosphere = true, forLanding = false)

    planet.addSatellite(satellite1)
    planet.addSatellite(satellite2)

    planet.printBody()
}

abstract class Body(
    val name: String,
    private val isAtmosphere: Boolean,
    private val forLanding: Boolean,
) {
    open fun printBody() {
        println("Небесное тело: $name, наличие атмосферы: $isAtmosphere, возможность высадки: $forLanding")
    }
}

class Planet(
    name: String,
    isAtmosphere: Boolean,
    forLanding: Boolean,
) : Body(name, isAtmosphere, forLanding) {
    private val satellites: MutableList<Satellite> = mutableListOf()

    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }

    override fun printBody() {
        super.printBody()
        if (satellites.isNotEmpty()) {
            println("Список спутников: ${satellites.joinToString(", ") { it.name }}")
        } else {
            println("У планеты нет спутников.")
        }
    }
}

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    forLanding: Boolean
) : Body(name, isAtmosphere, forLanding)