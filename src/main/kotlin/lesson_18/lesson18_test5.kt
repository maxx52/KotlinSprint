package ru.maxx52.lesson_18

fun main() {

    val screen = Screen()

    println(screen.drawCircle(10, 20, 5))
    println(screen.drawCircle(15.5f, 25.5f, 7.0f))
    println(screen.drawSquare(5, 10, 4))
    println(screen.drawSquare(12.2f, 18.4f, 6.5f))
    println(screen.drawDot(15, 30))
    println(screen.drawDot(12.3f, 34.5f))
}

class Screen {
    fun drawCircle(x: Int, y: Int, radius: Int): String {
        return "Рисуем круг, центр в точке ($x, $y), радиус $radius"
    }

    fun drawCircle(x: Float, y: Float, radius: Float): String {
        return "Рисуем круг, центр в точке ($x, $y), радиус $radius"
    }

    fun drawSquare(x: Int, y: Int, side: Int): String {
        return "Рисуем квадрат, начальная точка ($x, $y), сторона $side"
    }

    fun drawSquare(x: Float, y: Float, side: Float): String {
        return "Рисуем квадрат, начальная точка ($x, $y), сторона $side"
    }

    fun drawDot(x: Int, y: Int): String {
        return "Рисуем точку ($x, $y)"
    }

    fun drawDot(x: Float, y: Float): String {
        return "Рисуем точку ($x, $y)"
    }
}