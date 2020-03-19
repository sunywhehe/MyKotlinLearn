package com.sunyouwei.chapter02

fun main(args: Array<String>) {
    val a = 10
    if (a is Int) {
        println(a)
    }
    if (a !is Int) {
        println(a)
    }

    val b: String? = a as? String
    println(b)
    val c = a.toDouble()
    println(c)

    var d = 10
    d.toByte()
    d.toDouble()
    d.toFloat()
    d.toLong()
    d.toChar()
    d.toInt()
    d.toShort()
}