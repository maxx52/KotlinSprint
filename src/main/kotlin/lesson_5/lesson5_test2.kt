package ru.maxx52.lesson_5

fun main() {

    // Запрашиваем у пользователя год рождения:
    println("Введите ваш год рождения:")
    val userBirth = readln().toInt()

    // Вычисляем возраст:
    val userAge = CURRENT_YEAR - userBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Показать главную страницу"
    }

    // Вывод сообщения:
    println(resultText)

}
// Возраст совершеннолетия:
const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025