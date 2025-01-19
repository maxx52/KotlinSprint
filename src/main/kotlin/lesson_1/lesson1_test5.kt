package ru.maxx52.lesson_1

fun main() {

    // Объявляем переменную типа Double,
    // т.к. при дальнейшем делении не всегда результат будет целочисленным
    val seconds = 6480

    // Получаем кол-во часов и записываем в новую переменную:
    val hours = seconds / SECONDS_IN_HOUR

    // Получаем кол-во минут
    val minutes = seconds % SECONDS_IN_HOUR / MINUTE_IN_HOUR

    // Вычисляем кол-во секунд
    val sec = seconds % SECONDS_IN_HOUR % MINUTE_IN_HOUR

    println(sec)

    // Проверка разрядности полученных данных
    var result: String
    if (hours < 10) {
        result = String.format("%02d:", hours)
    } else {
        result = "$hours:"
    }
    if (minutes < 10) {
        result += String.format("%02d:", minutes)
    } else {
        result += "$minutes:"
    }
    if (sec < 10) {
        result += String.format("%02d:", sec)
    } else {
        result += "$sec"
    }

    // Вывод результата в консоль:
    println(result)

}

// Объявляем константы, чтобы избежать путаницы в программе
const val SECONDS_IN_HOUR = 3600
const val MINUTE_IN_HOUR = 60