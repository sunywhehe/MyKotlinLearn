package com.sunyouwei.chapter02

fun main(args: Array<String>) {
    val string: String = "Hello \'Kotlin\'"
    val chararr: String = String(charArrayOf('h', 'e', 'l', 'l', '\t', 'K', 'o', 't', 'l', 'o', 'n'))

    println("String 字符串" + string + "字符串拼接" + chararr)
    val a: Int = 1
    val b: Int = 0;
    println("Java 计算方式：" + a + "+" + b + "=" + (a + b))
    println("kotlin 计算方式：$a+$b=${a + b}")
    val money: Int = 888
    println("方式一：$$money" + " 方式二：" + "$" + money)
}