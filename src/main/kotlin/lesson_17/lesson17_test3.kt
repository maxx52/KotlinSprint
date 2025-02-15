package ru.maxx52.lesson_17

fun main() {
    val secretFolder = Folders("Main", 8, true)
    val normalFolder = Folders("Documents", 654)

    println(secretFolder.readFolder())

    println(normalFolder.readFolder())
}

class Folders(
    private val _name: String,
    private var _volume: Int,
    private var isSecret: Boolean = false,
) {
    private val name: String
        get() {
            return if (isSecret) {
                "Скрытая"
            } else {
                _name
            }
        }

    private val volume: Int
        get() {
            return if (isSecret) {
                0
            } else {
                _volume
            }
        }

    fun readFolder(): String {
        return "Папка $name, содержит $volume файлов"
    }
}