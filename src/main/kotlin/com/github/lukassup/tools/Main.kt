package com.github.lukassup.tools


fun makeGreeting(subject: String = "World"): String {
    return "Hello, $subject!"
}

fun main(args: Array<String>) {
    println(makeGreeting())
}
