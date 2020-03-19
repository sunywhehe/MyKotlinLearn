package com.sunyouwei.chapter02

class Vals(val a: Int = 5) {
    fun geta(): Int = a
}

fun varFun(): Int {
    var b = 10
    return b
}

var c = 15
fun main(args: Array<String>) {
    println(Vals().a)
    println(varFun())
    println(c)
}