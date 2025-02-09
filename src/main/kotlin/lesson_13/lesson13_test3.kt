package ru.maxx52.lesson_13

fun main() {

    val contactList: List<Contact2> = listOf(
        Contact2("Elena", 89995554334),
        Contact2("Maria", 89345671212),
        Contact2("Anna", 89654274526, "null"),
        Contact2("Anastasia", 89553262845, "West"),
        Contact2("Elisaveta", 89325452387, "Lux"),
    )

    val companies = contactList.mapNotNull { it.company }.toSet()

    println("Список компаний:")
    for (company in companies) {
        println(company)
    }
}

class Contact2(
    private val name: String,
    private val phone: Long,
    val company: String? = null
) {
    fun printContact(){
        println("- Имя: $name\n- номер телефона: $phone\n- компания: ${company ?: "не указана"}")
    }
}