package com.kotlin.istanbul

fun main(args: Array<String>) {
    var name: String? = "can be null"

    name = null

    println(name?.length) // prints name.length if name is not null , otherwise prints null.
//    println(name!!.length) // converts name to non-null type or throw NPE


    val listWithNullValues = listOf("Kotlin", null)

    listWithNullValues
        .forEach { it?.let { println(it) } }

    println("xxx".toIntOrNull() ?: "Not parsable value")
}
