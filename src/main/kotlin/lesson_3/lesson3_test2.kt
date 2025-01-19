package ru.maxx52.lesson_3

fun main() {

    // Исходные данные:
    val name = "Татьяна"
    val fatherName = "Сергеевна"
    val surNameBefore = "Андреева"
    val surNameAfter = "Сидорова"
    val ageBefore = 20
    val ageAfter = 22

    // Вывод результатов:
    println("$name $fatherName %s, %d лет".format(surNameBefore, ageBefore))
    println("$name $fatherName %s, %d лет".format(surNameAfter, ageAfter))

}