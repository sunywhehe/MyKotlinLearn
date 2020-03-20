package com.sunyouwei.chapter03

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf<Int>(6, 7, 8, 9, 10)

    println(list1.map { it + 1 })
    println(list1.mapIndexed { index, i -> index * i })
    println(list1.mapNotNull { it + 5 })
    println(listOf(list1, list2).flatMap { it -> it })
    println(list1.groupBy { if (it > 3) "big" else "small" })
}