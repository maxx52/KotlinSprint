package ru.maxx52.lesson_5

fun main() {

    // Исходные данные, список из 3-х рандомных чисел от 0 до 42:
    val defaultList: List<Int> = List(3) {
        (0..42).random()
    }

    println("Приветствуем вас в нашей лотерее! Нужно угадать два числа от 0 до 42")
    println("Введите первое число:")
    val userNumber1 = listOf(readln().toInt())

    println("Введите второе число:")
    val userNumber2 = readln().toInt()

    println("Введите третье число:")
    val userNumber3 = readln().toInt()

    // Помещаем введенные пользователем числа в список:
    val userList = listOf(userNumber1, userNumber2, userNumber3)

    val result = userList.intersect(defaultList)

    // Размер полученной коллекции:
    val sizeOfCollection = result.size

    val resultText = when (sizeOfCollection) {
        3 -> "Вы угадали все числа и выиграли джекпот!!!"
        2 -> "Вы угадали 2 числа и получаете ценный приз!!!"
        1 -> "Вы угадали 1 число и вам положен утешительный приз!"
        else -> "Вы не угадали ни одного числа..."
    }

    // Вывод результата:
    println(resultText)
    println("Числа были: $defaultList")
}