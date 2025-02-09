package ru.maxx52.lesson_14

import kotlin.math.PI

fun main() {
    val figures = mutableListOf<Figure>()

    val whiteRound1 = Round("white", 3)
    val whiteRound2 = Round("white", 5)
    val blackRound1 = Round("black", 7)
    val blackRound2 = Round("black", 4)

    val blackRect1 = Rectangle("black", 5, 3)
    val blackRect2 = Rectangle("black", 8, 2)

    val whiteRect1 = Rectangle("white", 6, 4)
    val whiteRect2 = Rectangle("white", 7, 11)

    figures.add(whiteRound1)
    figures.add(whiteRound2)
    figures.add(blackRound1)
    figures.add(blackRound2)
    figures.add(blackRect1)
    figures.add(blackRect2)
    figures.add(whiteRect1)
    figures.add(whiteRect2)

    val blackPerimeterSum = figures.filter { it.color == "black" }.sumOf { it.perimeter() }
    println("Сумма периметров всех черных фигур: %.2f".format(blackPerimeterSum))

    val whiteAreaSum = figures.filter { it.color == "white" }.sumOf { it.square() }
    println("Сумма площадей всех белых фигур: %.2f".format(whiteAreaSum))
}

abstract class Figure(
    val color: String,
) {
    abstract fun square(): Double
    abstract fun perimeter(): Double
}

class Round(
    color: String,
    private val radius: Int,
) : Figure(color) {
    override fun square(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    private val width: Int,
    private val height: Int,
) : Figure(color) {
    override fun square(): Double {
        return (width * height).toDouble()
    }

    override fun perimeter(): Double {
        return (2 * (width + height)).toDouble()
    }
}