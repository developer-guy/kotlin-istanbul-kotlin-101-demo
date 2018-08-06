package com.kotlin.istanbul

fun main(args: Array<String>) {
    // mutable collections - by adding Mutable prefix on it
    val mutableNumbers = mutableListOf(1, 2, 3, 4)

    mutableNumbers += 5

    mutableNumbers.forEach(::println)

    // immutable collections

    val immutableNumbers = listOf(1, 2, 3, 4)

    immutableNumbers
        .filter { it > 2 }
        .map { println(it) }
}