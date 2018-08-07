package com.kotlin.istanbul


// type safe builders
class Robot {
    fun turnLeft(): Unit {
        println("Turning leff")
    }

    fun turnRight(): Unit {
        println("Turning right")
    }
}

fun main(args: Array<String>) {

    // string interpolation

    val sampleString = "Batuhan"

    println("The str is $sampleString")
    println("The str is ${sampleString.length} characters")


    println("The sum of 1 and 2 : ${1 + 2}")


    val canBeAnyType: Any = "a sample String"

    when (canBeAnyType) { // instance type check and smart casting
        is String -> println("This is string and length is : ${canBeAnyType.length}")
        is Int -> println("This is Int and is bigger than 10 : ${canBeAnyType.compareTo(10)}")
    }

    listOf<Any>(1, 2, 3, 4)
        .map { it as Int * 2 } // type casting
        .forEach(::println)


    with(Robot()) {
        turnLeft()
        turnRight()
    }

}