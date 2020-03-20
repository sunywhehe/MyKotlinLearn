package com.sunyouwei.chapter03

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list.filter { it > 5 })
    println(list.filterNot { it > 5 })
    println(list.filterNotNull())
    println(list.take(4))
    println(list.takeLast(4))
    println(list.takeWhile { it < 5 })
    println(list.takeLastWhile { it > 5 })
    println(list.drop(4))
    println(list.slice(1..4))
}