package com.kotlin.istanbul

// lazy part

val lazyValue: List<Int> by lazy(mode = LazyThreadSafetyMode.NONE) {
    fetchDataFromService()
}

// storing properties in map
// This works also for var’s properties if you use a MutableMap
class Student(map: Map<String, Any?>) {
    val name: String by map
    val lastName: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)


    val fieldValuesMappings = mapOf("name" to "Batuhan", "lastName" to "Apaydın", "age" to 24)

    val student = Student(fieldValuesMappings)

    println(
        """
     |Name is : ${student.name}
     |Lastname is : ${student.lastName}
     |Age is : ${student.age}
       """.trimMargin("|")
    )
}

fun fetchDataFromService(): List<Int> {
    println("Fetching data")
    return listOf(1, 2, 3, 4)
}