package com.sunyouwei.chapter04

fun <T> asList(vararg ts: T): ArrayList<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

fun main(args: Array<String>) {
    val a = arrayOf(1, 2, 3)
    val list = asList(-1, 0, *a, 4)
    println(list)
}