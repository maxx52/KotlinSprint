package ru.maxx52.lesson_22

import java.util.Date

fun main() {

    val system = GalacticGuide("Alpha Centauri",
        "Тройная звёздная система в созвездии Центавра",
        Date(),
        4.3f)

    val (namePlace, descriptionPlace, date, distance) = system

    println("Название места или события: \"$namePlace\"")
    println("Описание места или события: \"$descriptionPlace\"")
    println("Дата и время события: $date")
    println("Расстояние от Земли: $distance св.лет")
}

data class GalacticGuide(
    val namePlace: String,
    val descriptionPlace: String,
    val date: Date,
    val distance: Float,
)