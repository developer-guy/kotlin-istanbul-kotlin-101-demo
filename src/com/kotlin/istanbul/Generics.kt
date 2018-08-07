package com.kotlin.istanbul

fun main(args: Array<String>) {

    val from = arrayOf(1.1, 2.2, 3.3, 4.4)

    val to = Array<Number>(from.size) { it }

    copy(from, to)

    to.forEach(::println)

    val numbers = mutableListOf(1, 2, 4, 3)

    val isBiggerThanThree = fun(i: Int): Boolean = i > 3

    filter(numbers) { it > 3 }
        .forEach(::println)

}


fun copy(from: Array<out Number>, to: Array<in Int>) {
    for ((index, value) in from.withIndex()) {
        to[index] = (value as Double).toInt()
    }
}

fun <T> filter(from: MutableList<T>, condition: (T) -> Boolean): MutableList<T> {
    val iterator: MutableListIterator<T> = from.listIterator()
    for (item in iterator) {
        if (condition(item)) {
            iterator.remove()
        }
    }
    return from
}