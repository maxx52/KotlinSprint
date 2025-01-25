package ru.maxx52.lesson_5

fun main() {

    println("Калькулятор топлива")

    // Запрашиваем данные у пользователя:
    println("Расстояние поездки, км:")
    val distance = readln().toFloat()

    println("Расход топлива на 100 км, л:")
    val fuelFlow = readln().toFloat()

    println("Текущая цена за литр топлива:")
    val price = readln().toFloat()

    // Расчет общего расхода топлива:
    val fuelConsumption = distance * fuelFlow / KILOMETERS

    // Расчет общей стоимости топлива:
    val fuelCost = fuelConsumption * price

    // Вывод сообщения:
    println("Для данной поездки необходимо %.2f литров топлива, что обойдется вам в %.2f рублей".format(fuelConsumption, fuelCost))
}
const val KILOMETERS = 100