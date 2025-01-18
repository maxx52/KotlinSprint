package ru.maxx52.lesson_1

fun main() {

    // Объявляем переменную типа Double,
    // т.к. при дальнейшем делении не всегда результат будет целочисленным
    val seconds: Double = 6480.0

    // Получаем кол-во часов и записываем в новую переменную:
    val hours = (seconds / 3600).toInt()

    // Получаем кол-во минут и приводим к целому числу
    val minutes = (seconds % 3600 / 60).toInt()

    // Вычисляем кол-во ставшихся секунд
    val sec = seconds.toInt() - (hours * 3600 + minutes * 60)

    // Проверка разрядности полученных данных
    val nullString: String = "0"
    var result: String
    if (hours < 10) {
        result = "$nullString$hours:"
    } else {
        result = "$hours:"
    }
    if (minutes < 10) {
        result += "$nullString$minutes:"
    } else {
        result += "$minutes:"
    }
    if (sec < 10) {
        result += "$nullString$sec"
    } else {
        result += "$sec"
    }

    // Вывод результата в консоль:
    println(result)

}