package ru.maxx52.lesson_21

import java.io.File

fun main() {
    val wordFile = File("words.txt")
    wordFile.createNewFile()

    wordFile.writeWord("Hello")
    wordFile.writeWord("cat")
    wordFile.writeWord("dog")

    println("Содержимое файла:")
    println(wordFile.readText())
}

fun File.writeWord(word: String) {
    val lowerCaseWord = word.lowercase()
    val currentContent = this.readText()
    this.writeText("$lowerCaseWord\n$currentContent")
}