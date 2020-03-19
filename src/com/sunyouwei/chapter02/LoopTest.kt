package com.sunyouwei.chapter02

fun main(args: Array<String>) {
    var arrayOfString: Array<String> = arrayOf("我", "爱", "Kotlin")
    for (string in arrayOfString) {
        println(string)
    }

    for (hh in 0..10)
        println(hh)

    for ((index, value) in arrayOfString.withIndex()) {
        println("index:${index} ,value:${value}")
    }


    var times = 0
    var sum = 1
    while (times <= 2017) {
        if (times % 2 == 1) {
            sum += times
        }
        times++
    }

    println(sum)

    val limit = 100
    var number2 = 1
    var sum2 = 0
    do {
        sum2 += number2
        number2++
    } while (number2 <= limit)
    println("${sum2}")
}