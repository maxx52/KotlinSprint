package ru.maxx52.lesson_18

//В игре используются типы игральных костей с разным количеством граней: 4, 6 и 8.
//
//Опиши их иерархию, создав по классу на каждый тип. У каждой кости должен быть метод,
// бросающий кость и печатающий значение в консоль.
//
//Для демонстрации полиморфизма “включения”:
//
//- создай несколько объектов с разными гранями;
//- собери из них список объектов, указав тип списка;
//- выполни итерацию по списку и вызови у каждого объекта метод броска кости.

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    val listDice: List<Dice> = listOf(dice4, dice6, dice8)

    listDice.forEach { dice ->
        println(dice.roll())
    }
}

abstract class Dice {
    abstract fun roll(): String
}

class Dice4 : Dice() {
    override fun roll(): String {
        return "Кость с 4 гранями, выпало число ${(1..4).random()}"
    }
}

class Dice6 : Dice() {
    override fun roll(): String {
        return "Кость с 6 гранями, выпало число ${(1..6).random()}"
    }
}

class Dice8 : Dice() {
    override fun roll(): String {
        return "Кость с 8 гранями, выпало число ${(1..8).random()}"
    }
}