package ru.maxx52.lesson_13

const val CONTACT_COUNTER = 5

fun main() {
    val contactList = mutableListOf<Contact3>()

    for (i in 1..CONTACT_COUNTER) {
        println("Введите имя контакта:")
        val name = readln()

        println("Введите номер телефона:")
        val phoneInput = readln()
        val phone = phoneInput.toLongOrNull()

        println("Введите название компании:")
        val companyInput = readln()

        if (phone != null) {
            val contact = Contact3(name, phone, companyInput.ifBlank { null })
            contactList.add(contact)
        } else {
            println("Не введен номер телефона для $name, запись не добавлена.")
        }
    }

    println("\nСозданные контакты:")
    for (contact in contactList) {
        contact.printContact()
    }

    val companies = contactList.mapNotNull { it.company }.toSet()
    println("\nСписок компаний:")
    for (company in companies) {
        println(company)
    }
}

class Contact3(
    private val name: String,
    private val phone: Long? = null,
    val company: String? = null
) {
    fun printContact() {
        println("- Имя: $name\n- Номер телефона: $phone\n- Компания: ${company ?: "не указана"}")
    }
}

