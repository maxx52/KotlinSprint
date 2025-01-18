package ru.maxx52.lesson_2

fun main() {

    println("Задача 2 к Уроку 2")

    // Исходные данные:
    val amountWorkers = 50 // кол-во постоянных сотрудников
    val amountInterns = 30 // кол-во стажёров
    val paymentWorkers = 30000 // з/п постоянных сотрудников
    val paymentInterns = 20000 // з/п стажёров

    // Расходы на выплату зарплаты постоянных сотрудников:
    val paymentAllWorkers = amountWorkers * paymentWorkers

    // Общие расходы по ЗП после прихода стажеров:
    val paymentSum = paymentAllWorkers + amountInterns * paymentInterns

    // Среднюю ЗП одного сотрудника после устройства стажеров:
    val paymentMedian = paymentSum / (amountWorkers + amountInterns)

    // Вывод результатов:
    println("Расходы на выплату зарплаты постоянных сотрудников: $paymentAllWorkers")
    println("Общие расходы по ЗП после прихода стажеров: $paymentSum")
    println("Средняя ЗП одного сотрудника: $paymentMedian")

}