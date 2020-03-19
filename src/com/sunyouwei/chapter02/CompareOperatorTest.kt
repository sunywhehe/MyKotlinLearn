package com.sunyouwei.chapter02

fun main(args: Array<String>) {
    val a = 10
    println(
        "小于 ${a < 10}，大于${a > 10}，大于或等于${a >= 10}，小于或等于${a <= 10}" +
                "，等于${a == 10}，不等于${a != 10}，恒等于${a === 10}，非恒等于${a !== 10}"
    )
}