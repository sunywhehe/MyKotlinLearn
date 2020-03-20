package com.sunyouwei.chapter03

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(6, 7, 8, 9, 10, 11)

    println(list1.zip(list2))
    println(list1.zip(list2) { it1, it2 -> it1 + it2 })
    println(list1.partition { it > 3 })
    println(list1.plus(list2))
    println(listOf(Pair(1, 2), Pair(3, 4)).unzip())
}