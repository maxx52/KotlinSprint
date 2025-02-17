package ru.maxx52

//В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки.
// Чтобы рассчитывать упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.
//
//Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой. Если посылка – куб,
// то только с длиной ребра.

fun main() {

    val rect = Rect(50, 80, 20)
    val cube = Cube2(40)

    println("Площадь поверхности: ${rect.findSquare()}")
    println("Площадь поверхности: ${cube.findSquare()}")
}

abstract class Sending(
    open val width: Int,
) {
    open fun findSquare(): Int {
        val square: Int = 6 * width * width
        return square
    }
}

class Rect(
    override val width: Int,
    private val height: Int,
    private val deep: Int,
) : Sending(width) {
    override fun findSquare(): Int {
        val square = 2 * (width * height + width * deep + height * deep)
        return square
    }
}

class Cube2(
    width: Int
) : Sending(width)