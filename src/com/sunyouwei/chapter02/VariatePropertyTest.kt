package com.sunyouwei.chapter02

var var1: String = "kotlin";
//var var2:Int?
var var3: Int = 10
var var4 = 5
    set(value) {
        if (value <= 5) {
            field = value
        }
    }

fun main(args: Array<String>) {
    println("var1 before:" + var1)
    var1 = var1 + 5.3
    println("var1 after:" + var1)

    println("var3 before:" + var3)
    var3 += 5
    println("var3 after:" + var3)

    println("var4 before:" + var4)
    var4 += 5
    println("var4 after:" + var4)
}