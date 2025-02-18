package ru.maxx52.lesson_19

fun main() {
    val tank = Tank()

    tank.shoot()
    tank.reload(Missile.RED)
    tank.reload(Missile.RED)
    tank.shoot()
    tank.reload(Missile.CYAN)
    tank.shoot()
    tank.reload(Missile.GREEN)
    tank.shoot()
}

class Tank {
    private var currentMissile: Missile = Missile.NULL

    fun reload(missile: Missile) {
        if (currentMissile == missile) {
            println("Уже заряжен данный вид снарядов")
        } else {
            currentMissile = missile
            println("Перезарядили на: $currentMissile")
        }
    }

    fun shoot() {
        if (currentMissile == Missile.NULL) {
            println("Командир, нам нечем стрелять! Зарядите снаряды!")
        } else {
            println("Выстрел! Урон составил ${currentMissile.damage} единиц.")
            currentMissile = Missile.NULL
        }
    }
}

enum class Missile(private val item: String, val damage: Int) {
    CYAN("Синий", 5),
    GREEN("Зелёный", 10),
    RED("Красный", 20),
    NULL("Не заряжен", 0);

    override fun toString(): String {
        return item
    }
}