package ru.maxx52.lesson_15

fun main() {
    val fish = Fish("Карась")
    val seagull = Seagull("Чайка")
    val duck = Duck("Утка")

    fish.toSwim()
    seagull.toFly()
    seagull.toSwim()
    duck.toFly()
    duck.toSwim()
}

abstract class Animal(protected val name: String) {
    protected fun printMovement(movement: String) {
        println("$name может $movement")
    }
}

class Fish(name: String) : Animal(name), Swim {
    override fun toSwim() {
        printMovement("плавать")
    }
}

class Seagull(name: String) : Animal(name), Fly, Swim {
    override fun toFly() {
        printMovement("летать")
    }

    override fun toSwim() {
        printMovement("плавать")
    }
}

class Duck(name: String) : Animal(name), Fly, Swim {
    override fun toFly() {
        printMovement("летать")
    }

    override fun toSwim() {
        printMovement("плавать")
    }
}

interface Fly {
    fun toFly()
}

interface Swim {
    fun toSwim()
}