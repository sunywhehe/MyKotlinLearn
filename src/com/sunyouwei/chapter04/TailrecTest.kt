package com.sunyouwei.chapter04

class MyTest {
    tailrec fun fac(n: Int): Double {
        var t: Double = 1.0
        if (n == 0 || n == 1) {
            t = 1.0
        } else {
            t = n * fac(n - 1)
        }
        return t
    }
}

fun main(args: Array<String>) {
    var myTest = MyTest()

    println(myTest.fac(4))
}
