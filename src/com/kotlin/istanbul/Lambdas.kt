package com.kotlin.istanbul

// high order functions --> means return function , take function as parameter

// function type -> (A) -> B

fun main(args: Array<String>) {
    val sum = { a: Int, b: Int -> a + b } //lamda expression

    val sum2 = fun(a: Int, b: Int) = a + b // anonymous function

    // implicit name --> it
    doSomeWorkOnArray(arrayOf(1, 2, 3)) { it * 2 }
        .forEach(::println)

    // functions with literal receivers

    val sum3: Int.(Int) -> Int = fun Int.(other: Int) = this + other

    val sum4: Int.(Int) -> Int = { other: Int -> this.plus(other) }


    html {
        this.body()
        return@html head()
    }
}

fun html(init: HTML.() -> String): HTML {
    val html = HTML()
    html.init()
    return html
}

class HTML {
    fun body() {

    }

    fun head(): String = "head"
}

inline fun <T, reified R : Any> doSomeWorkOnArray(items: Array<T>, work: (T) -> R): Array<R?> {
    val copy = arrayOfNulls<R>(items.size)

    for ((index, value) in items.withIndex()) {
        val workedItem = work(value)
        copy[index] = workedItem
    }
    return copy
}
