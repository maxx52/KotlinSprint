package ru.maxx52.lesson_3

fun main() {

    // Исходные данные:
    val name = "Татьяна"
    val fatherName = "Сергеевна"
    var surName = "Андреева"
    var age = 20

    // Вывод результатов до замужества, в 20 лет:
    println("%s %s %s, %d лет".format(surName, name, fatherName, age))

    // В 22 года вышла замуж:
    surName = "Сидорова"
    age = 22
    println("%s %s %s, %d лет".format(surName, name, fatherName, age))
}