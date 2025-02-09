package ru.maxx52.lesson_13

fun main() {

    val contact1 = Contact("Alex", 89008007007, null)
    val contact2 = Contact("Yana", 89091234567, "Kotlin")
}

class Contact(
    name: String,
    phone: Long,
    company: String?
) {
    init {
        println("Контакт: имя - $name, номер телефона - $phone, компания - ${company ?: "не указана"}")
    }
}