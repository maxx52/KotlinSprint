package ru.maxx52.lesson_17

fun main() {
    val quiz = Quiz()

    println(quiz.question)
    println("Правильный ответ: ${quiz.answer}")

    quiz.answer = "Евразия"
    println("Правильный ответ: ${quiz.answer}")
}

class Quiz(
    private var _question: String = "Какой самый большой континент?",
    private var _answer: String = "Азия",
) {
    var question: String
        get() = _question
        set(value) {
            _question = value
        }

    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}