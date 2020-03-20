package com.sunyouwei.chapter03

val emptylist = emptyList<String>()
val list = listOf<Int>(1, 2, 3)
val mlist = mutableListOf<Int>(1, 2, 3)

fun main(args: Array<String>) {
    val device1 = listOf("显示器", "键盘", "鼠标", "主机")
    val device2 = listOf("联想笔记本", "戴尔笔记本", "外星人笔记本")
    val devices = listOf(device1, device2)

    println("${devices.indexOf(device1)}  ,${devices.get(1)}, ${devices.lastIndexOf(device2)}")

    devices.forEach(::println)



}