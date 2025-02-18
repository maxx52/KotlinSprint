package ru.maxx52.lesson_19

fun main() {
    println("Введите имя человека с большой буквы и пол (${Gender.MALE} или ${Gender.FEMALE}):")

    val peopleList = mutableListOf<Pers>()

    var iteration: Int = NUMBER
    for (i in 1..NUMBER) {
        print("Человек #$i - Имя: ")
        val nameMan = readln()
        print("Пол: ")
        val genderMan = readln()

        if (nameMan.isBlank() || genderMan.isBlank()) {
            println("Поле имени или пола не может быть пустым!")
            iteration--
            continue
        }

        val gender = when (genderMan.uppercase()) {
            "МУЖЧИНА" -> Gender.MALE
            "ЖЕНЩИНА" -> Gender.FEMALE
            else -> {
                println("Некорректный ввод пола! Пожалуйста, введите 'Мужчина' или 'Женщина'.")
                iteration--
                continue
            }
        }

        peopleList.add(Pers(nameMan, gender))
    }

    println("\nСписок людей:")
    peopleList.forEach { person ->
        println(person)
    }
}

data class Pers(
    val name: String,
    val gender: Gender
)

enum class Gender(private val displayName: String) {
    MALE("Мужчина"),
    FEMALE("Женщина");

    override fun toString(): String {
        return displayName
    }
}

const val NUMBER = 5