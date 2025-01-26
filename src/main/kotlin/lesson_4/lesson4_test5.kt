package ru.maxx52.lesson_4

fun main() {

    // Корабль с повреждениями:
    val crashCompany = COMPANY.equals(70)

    // Запрашиваем данные у пользователя:
    println("Наличие повреждений корпуса (true/false):")
    val isCrashFromUser = readln().toBoolean()

    println("Текущий состав экипажа:")
    val companyFromUser = readln().toShort()

    println("количество ящиков с провизией на борту")
    val boxesFromUser = readln().toShort()

    println("благоприятность метеоусловий (true / false):")
    val isWeatherFromUser = readln().toBoolean()

    // Проверка условий:
    val result = if (isCrashFromUser == (IS_CRASH && companyFromUser.equals(COMPANY))) {
        if((isCrashFromUser == crashCompany) && (boxesFromUser >= BOXES)) {
            if (((isWeatherFromUser == IS_WEATHER) || (isWeatherFromUser != IS_WEATHER))) {
                true
            } else false
        } else false
    } else false


    // Проверка условий для плавания:
    println("""
        Может ли корабль отправиться в плавание: $result
    """.trimIndent())
}
// Корабль без повреждений:
val COMPANY = 50..70
const val BOXES: Short = 50
const val IS_WEATHER = false
const val IS_CRASH = false
