package ru.maxx52.lesson_21

fun main() {
    val example = "hello"
    println("Количество гласных в строке \"$example\": ${example.vowelCount()}")
}

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in this.lowercase()) {
        if (char in vowels) {
            count++
        }
    }
    return count
}