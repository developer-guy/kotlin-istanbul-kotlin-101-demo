package com.kotlin.istanbul


open class Human(
    val firstName: String,
    val lastName: String,
    val age: Int
) {

    init {
        println("Initializing Human!")
    }

}

interface ValidationCase {
    fun isLicenceValid(): String
}

class Person(firstName: String, lastName: String, age: Int) :
    Human(firstName, lastName, age),
    ValidationCase {

    init {
        println("Initializing Person!")
    }

    constructor(fullName: Array<String>, age: Int) : this(fullName[0], fullName[1], age)

    override fun isLicenceValid(): String = if (this.age > 20) "valid" else "not valid"

    fun printDetails() {
        println(
            """
             |Firstname is $firstName
             |Lastname is $lastName
             |Age is $age
             |Licence status: ${isLicenceValid()}
            """.trimMargin("|")
        )
    }

    companion object {
        fun of(firstName: String, lastName: String, age: Int): Person = Person(firstName, lastName, age)
    }
}

const val EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"

fun isEmailValid(email: String): Boolean {
    return EMAIL_REGEX.toRegex().matches(email)
}

data class User(val userName: String, val password: String) {
    var email: String = ""
        set(value) {
            if (isEmailValid(value)) field = value
        }
        get() = field
}


fun main(args: Array<String>) {
    val person = Person("Batuhan.Apaydın".split(".").toTypedArray(), 24)
    person.printDetails()

    val person2 = Person.of("Enes", "Açıkoğlu", 24)
    person2.printDetails()


    val user = User("bapaydin", "123456")
    user.email = "bapaydin67@gmail.com"

    println("Username: ${user.userName} and password: ${user.password} and email : ${user.email}")

    val (userName, password) = User("bapaydin", "123456") // De-structring declarations

    println("Username: $userName and password: $password")
}