package com.sunyouwei.chapter02

fun allSum(vararg x: Int): Int {
    var sum = 0
    for (i in x) {
        sum += i
    }
    return sum
}

fun twoSum(x: Int, y: Int): Int {
    return x + y
}

fun main(args: Array<String>) {
    println("twoSum 函数使用返回的结果" + twoSum(10, 15))
    var a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 100)
    println("allSum 函数返回：" + allSum(*a))

    for (num in a) {
        if (num == 3) break
        println(num)
    }

    for (num in a) {
        if (num == 3) continue
        println(num)
    }

    loop@ for (i in 1..100) {
        println("loop i:" + i)
        for (j in 1..100) {
            println("loop j:" + j)
            if (j == 1) break@loop
        }
    }
}