package com.sunyouwei.chapter02


fun main(args: Array<String>) {
    var a = 3
    var b = -a
    var c = a
    println("原始值 ${a} ,负复数值${b} ,正值${c}  ,加加${++a}，减减${--b}")

    var d = 15
    var e = 10
    var f = 5
    println("加 ${d + e},减 ${d - e} ,乘 ${d * e} ,除 ${d / e} ，取余${d % e} ,加减乘${d + e * f}")
}