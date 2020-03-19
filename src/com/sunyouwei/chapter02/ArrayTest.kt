package com.sunyouwei.chapter02

import com.sun.xml.internal.fastinfoset.util.StringArray

val arrayOfInt: IntArray = intArrayOf(1, 2, 3, 4, 5)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o')
val arrayOfString: Array<String> = arrayOf("我", "爱", "Kotlin")

fun main(args: Array<String>) {
    println(arrayOfInt[2])

    for (string in arrayOfString) {
        println(string)
    }

    for (mChar in arrayOfChar) {
        println(mChar)
    }
}