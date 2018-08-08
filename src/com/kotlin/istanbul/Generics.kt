package com.kotlin.istanbul

fun main(args: Array<String>) {

    val from = arrayOf(1, 2, 3, 4, 5)

    val to = Array<Any?>(from.size) { it }

    copy(from, to)

    printArray(to)

    val numbers = mutableListOf(1, 2, 4, 3)

    filter(numbers) { it > 3 }
        .forEach(::println)

}


fun copy(from: Array<out Any>, to: Array<Any?>) {
    for (index in from.indices) {
        to[index] = from[index]
    }
}

fun printArray(array: Array<*>) {
    array.forEach { println(it) }
}

fun <T> filter(from: MutableList<T>, condition: (T) -> Boolean): MutableList<T> {
    val iterator: MutableListIterator<T> = from.listIterator()
    for (item in iterator) {
        if (!condition(item)) {
            iterator.remove()
        }
    }
    return from
}