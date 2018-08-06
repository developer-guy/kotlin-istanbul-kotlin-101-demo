package com.kotlin.istanbul

import java.lang.Exception

typealias IntPredicate = (Int) -> Boolean

//Extension function
fun MutableList<Int>.addIf(number: Int, condition: IntPredicate) {
    if (condition(number)) {
        this.add(number)
    }
}

fun <T> MutableList<T>.filterNulls(): MutableList<T> {
    this.removeIf { it == null }
    return this
}

//Extension property
val <T> MutableList<T>.lastItem: T get() = this[this.size - 1]


fun assertThat(assertion: Boolean, lazyMessage: () -> String) {
    if (!assertion) {
        val message = lazyMessage.invoke()
        throw Exception(message)
    }
}


fun main(args: Array<String>) {
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.addIf(5) { it > 10 }

    assertThat(numbers.lastItem == 4) { "Last item must be 4" }


    mutableListOf(1, 2, 3, null)
        .filterNulls()
        .forEach(::println)
}