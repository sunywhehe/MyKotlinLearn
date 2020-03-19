package com.sunyouwei.chapter02

fun main(args: Array<String>) {
    var q = true
    var r = false
    println("${q || r},  ${q or r} ,${q && r} ,${q and r} ,${q xor r} ,${!r}")

    var m = 20
    var n = 15
    m += n
//    m -= n
//    m *= n
//    m /= n
//    m %= n
    println("${m}")
}