package com.sunyouwei.chapter03

fun main(args: Array<String>) {
    val list1 = listOf(1, 3, 4, 5, 6, 7, 8, 9, 10, 2)

    println(list1.reversed())
    println(list1.sorted())
    println(list1.sortedBy { it % 2 })
    println(list1.sortedDescending())
    println(list1.sortedByDescending { it % 2 })
}