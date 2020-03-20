package com.sunyouwei.officialdoc.getstart

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}


fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

val PI = 3.14
var y = 0

fun incrementY() {
    y += 1
}

fun main(args: Array<String>) {
    println("Hello world!")

    print("sum of 3 and 5 is ")
    println(sum(3, 5))

    println("sum of 19 and 23 is ${sum(19, 23)}")

    printSum(-1, 8)
    printSum2(-1, 8)

    val a: Int = 1  // 立即赋值
    val b = 2   // 自动推断出 `Int` 类型
    val c: Int?  // 如果没有初始值类型不能省略
    c = 3       // 明确赋值
    println("a = $a, b = $b, c = $c")

    var x = 5 // 自动推断出 `Int` 类型
    x += 1
    println("x = $x")

    println("x = $y; PI = $PI")
    incrementY()
    println("incrementY()")
    println("x = $y; PI = $PI")


    var a2 = 1
    // 模板中的简单名称：
    val s1 = "a is $a2"

    a2 = 2
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a2"
    println(s2)


}