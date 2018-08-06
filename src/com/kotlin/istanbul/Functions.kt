package com.kotlin.istanbul


// simple usage
fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}

// return keyword omitted
fun sum2(number1: Int, number2: Int): Int = number1 + number2


// default arguments
fun slice(items: IntArray, start: Int = 0, end: Int = items.size - 1): List<Int> {
    return items.slice(start..end)
}

//named arguments
fun sendMessageTo(to: String, message: String) = println("Sending $message to $to")

// vargs , * spread operator
fun sum(vararg numbers: Int): Int {
    return numbers.reduce { acc, number ->
        return@reduce acc + number
    }
}

// infix notation - omitting the dot and parentheses
infix fun String.asRepresent(other: Int): Boolean = this.toIntOrNull() == other

fun main(args: Array<String>) {

    println("The result of 1 + 2 ${sum(1, 2)}")
    println("The result of 1 + 2 ${sum2(1, 2)}")

    val numbers = intArrayOf(1, 2, 3, 4, 5)

    slice(numbers, 1, 3)
        .forEach(::println)

    sendMessageTo(message = "Hello", to = "Batuhan")

    println(sum(1, 2, 3, 4))

    println("123" asRepresent 123)
}