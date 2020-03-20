package com.sunyouwei.chapter03

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list1.contains(14))
    println(list1.elementAt(4))
    println(list1.elementAtOrElse(14, { it + 3 }))
    println(list1.elementAtOrNull(14))
    println(list1.first())
    println(list1.first { it % 3 == 0 })
    println(list1.firstOrNull { it > 14 })
    println(list1.indexOf(5))
    println(list1.indexOfFirst { it == 14 })

    println(list1.lastOrNull { it == 8 })
    println(list1.single { it == 8 })
    println(list1.singleOrNull { it == 8 })
}