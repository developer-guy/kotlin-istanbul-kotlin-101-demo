package com.kotlin.istanbul

typealias IntPredicate = (Int) -> Boolean

//Extension function
fun MutableList<Int>.addIf(number: Int, condition: IntPredicate) {
    if (condition(number)) {
        this.add(number)
    }
}

// Generic extension function
fun <T> MutableList<T>.clearNullItems(): MutableList<T> {
    this.removeIf { it == null }
    return this
}

//Extension property
val <T> MutableList<T>.lastItem: T get() = this[this.size - 1]


fun main(args: Array<String>) {
    val numbers = mutableListOf(1, 2, 3, 4)

    numbers.addIf(5) { it > 10 }

    println(numbers.none { it == 5 })

    val elementsWithoutNull = mutableListOf(1, 2, 3, null)
        .clearNullItems()

    println(elementsWithoutNull.lastItem)

}