package com.kotlin.istanbul

fun main(args: Array<String>) {
    // read only variable
    val readOnlyVariable: String = "Batuhan" // immediate assignment

    val readOnlyVariableWithTypeInferred = "Batuhan" // String type inferred

    val readOnlyVariableLazy: String // type is required when no value provided

    readOnlyVariableLazy = "Batuhan"

    // variable declaration
    var name: String = "Batuhan"  // same rules applied

}