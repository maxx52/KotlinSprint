package ru.maxx52.lesson_17

fun main() {
    val quiz = Quiz("Какой самый большой континент?", "Азия")

    println(quiz.question)
    println("Правильный ответ: ${quiz.answer}")

    quiz.answer = "Евразия"
    println("Обновленный ответ: ${quiz.answer}")
}

class Quiz(
    private val _question: String,
    private var _answer: String
) {
    val question: String
        get() = _question

    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}