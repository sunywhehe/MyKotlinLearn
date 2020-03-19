package com.sunyouwei.chapter02

class course(var name: String) {
    init {
        println("您选择的课程名称是${name}")
    }
}

fun main(args: Array<String>) {
    val studentobj = course("kotlin")
}