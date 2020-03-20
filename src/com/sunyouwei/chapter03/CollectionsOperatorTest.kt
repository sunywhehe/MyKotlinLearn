package com.sunyouwei.chapter03

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list.any { it > 10 })
    println(list.all { it in 1..10 })
    println(list.sumBy { it * it })
    println(list.count { it > 5 })
    println(list.min())
    println(list.minBy { it * -1 })
}