package com.kotlin.istanbul


fun main(args: Array<String>) {
    val a = 100
    val b = 150

    val max: Int

    //if as expression
    max = if (a > b) a else b

    println("Max value result between $a and $b is : $max")


    //when

    // value check
    // range validation

    val number = 10

    when (number) {
        10 -> println("evet sayımız 10")
        else -> println("Bilinmiyor")
    }


    val range = 1..10

    when (number) {
        in range -> println("Evet $number $range aralığında")
        !in range -> println("Hayır $number $range aralığında değil değil")
    }

    //for

    // in,step,downTo
    // withIndices
    // withIndex


    val numbers = listOf(1, 2, 3, 4, 5)

    for (number in numbers) {
        println("Number $number")
    }


    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 10 downTo 0 step 3) {
        println(i)
    }

    println("----------------------------")

    for (index in numbers.indices) {
        println("At $index value ${numbers[index]}")
    }

    println("----------------------------")


    for ((index, value) in numbers.withIndex()) {
        println("At $index value $value")
    }

}