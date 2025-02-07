package com.example

fun greet(): String {
    return "Hello"
}

fun greetWithName(name: String = "World"): String {
    return "Hello, $name"
}

fun String.addExclamation(): String {
    return this + "!"
}
