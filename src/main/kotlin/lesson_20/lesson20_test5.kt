package ru.maxx52.lesson_20

fun main() {

    val robot = Robot()
    robot.say()
    robot.setModifier { phrase -> phrase.reversed() }
    robot.say()
}

class Robot {
    private val phrases = listOf(
        "Ты ещё не всё попробовал",
        "На всё воля Бога",
        "Всё будет хорошо!",
        "У тебя всё получится!",
        "На всё нужно время",
    )

    private var modifier: ((String) -> String)? = null

    fun say() {
        val phrase = phrases.random()
        val modifiedPhrase = modifier?.invoke(phrase) ?: phrase
        println(modifiedPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}