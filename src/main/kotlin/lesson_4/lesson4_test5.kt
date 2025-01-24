package ru.maxx52.lesson_4

fun main() {

    // Исходные данные:
        // Корабль без повреждений:
        val company = 50..70
        val boxes: Short = 50
        val isWeather = false
        val isCrash = false

            // Корабль с повреждениями:
            val crashCompany = company.equals(70)

    // Запрашиваем данные у пользователя:
    println("Наличие повреждений корпуса (true/false):")
    val crashFromUser = readln().toBoolean()

    println("Текущий состав экипажа:")
    val companyFromUser = readln().toShort()

    println("количество ящиков с провизией на борту")
    val boxesFromUser = readln().toShort()

    println("благоприятность метеоусловий (true / false):")
    val weatherFromUser = readln().toBoolean()

    // Проверка условий:
    val result = crashFromUser == (isCrash &&
            companyFromUser.equals(company)) ||
            (crashFromUser == crashCompany) &&
            (boxesFromUser >= boxes) &&
            ((weatherFromUser == isWeather) ||
            (weatherFromUser != isWeather))


    // Проверка условий для плавания:
    println("""
        Может ли корабль отправиться в плавание: $result
    """.trimIndent())
}