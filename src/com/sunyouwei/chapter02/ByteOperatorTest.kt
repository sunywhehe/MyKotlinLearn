package com.sunyouwei.chapter02

fun main(args: Array<String>) {
    val a = 10
    println("shl : ${a.shl(2)}")
    println("shr : ${a.shr(1)}")
    println("ushr : ${a.ushr(1)}")
    println("and : ${a.and(1)}")
    println("or : ${a.or(1)}")
    println("xor : ${a.xor(1)}")
    println("inv : ${a.inv()}")
}