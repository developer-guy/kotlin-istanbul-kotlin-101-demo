package com.kotlin.istanbul

fun main(args: Array<String>) {
    var name: String? = "Batuhan"

    name = null

    println(name?.length) // prints name.length if name is not null , otherwise prints null.
//    println(name!!.length) // converts name to non-null type or throw NPE


    val listWithNullValues = listOf("Kotlin", null)

    for (item in listWithNullValues) {
        item?.let { println(it) }  // make item nullable
    }

    println(parse("xxx") ?: "Not parsable value")
}

fun parse(s: String): Int? = s.toIntOrNull()