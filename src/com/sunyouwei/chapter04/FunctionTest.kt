package com.sunyouwei.chapter04

fun double(x: Int): Int {
    return 2 * x
}

fun plus(a: Int, b: Int = 0): Int {
    return a + b
}

fun ex(x: Int): Int = 2 * x

fun no(x: Int): Unit {

}

fun main(args: Array<String>) {
    println(no(1))
    println(double(10))
    println(plus(1))
    println(plus(1, 2))
}

