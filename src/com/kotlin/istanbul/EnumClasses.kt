package com.kotlin.istanbul

enum class IntArithmetics(val symbol: String) {
    TIMES("*") {
        override fun apply(t1: Int, t2: Int): Int = operate(t1, this.symbol, t2)
    },
    PLUS("+") {
        override fun apply(t1: Int, t2: Int): Int = operate(t1, this.symbol, t2)
    },
    MINUS("-") {
        override fun apply(t1: Int, t2: Int): Int = operate(t1, this.symbol, t2)
    };

    abstract fun apply(t1: Int, t2: Int): Int

    fun operate(t1: Int, symbol: String, t2: Int): Int = when (symbol) {
        "*" -> t1 * t2
        "+" -> t1 + t2
        else -> t1 - t2
    }
}

inline fun <reified T : Enum<T>> joinAllItemsInEnum(): String = T::class.java.fields.joinToString { it.name }


fun main(args: Array<String>) {
    println("Items in enum : ${joinAllItemsInEnum<IntArithmetics>()}")
    println("Result of 1 plus 2 : ${IntArithmetics.PLUS.apply(1, 2)}")
    println("Result of 4 times 5 : ${IntArithmetics.TIMES.apply(4, 5)}")
}