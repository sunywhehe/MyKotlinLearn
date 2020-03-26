package com.sunyouwei.chapter04

fun sum(number: Int): Int {
    var index = 1
    var sum = 0;

    do {
        sum += fac(index)
        index++
    } while (index <= number)

    return sum
}

fun fac(number: Int): Int {
    var index = 1
    var sum = 1

    do {
        sum *= index
        index++
    } while (index <= number)

    return sum
}

fun main(args: Array<String>) {
    println(sum(4))
}