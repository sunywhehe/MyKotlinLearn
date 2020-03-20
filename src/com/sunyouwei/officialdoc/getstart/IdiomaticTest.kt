package com.sunyouwei.officialdoc.getstart

import java.awt.Rectangle
import java.io.File
import java.math.BigDecimal
import java.nio.file.Files
import java.nio.file.Paths

data class Customer(val name: String, val email: String)

fun foo(a: Int = 0, b: String = "") {}


object Resource {
    val name = "Name"
}

fun main(args: Array<String>) {
    var name = 2
    println("Name $name")

    var x = ""
    when (x) {
        "Foo" -> {
        }
        "Bar" -> {
        }
        else -> {
        }
    }

    for (i in 1..100) {
    }  // 闭区间：包含 100
    for (i in 1 until 100) {
    } // 半开区间：不包含 100
    for (x in 2..10 step 2) {
    }
    for (x in 10 downTo 1) {
    }
    var x2 = 10
    if (x2 in 1..10) {
    }

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["key"])
    map["key"] = 2

    val p: String by lazy {
        ""
    }

    fun String.spaceToCamelCase() {}

    "Convert this to camelcase".spaceToCamelCase()

    val files = File("Test").listFiles()
    println(files?.size)
    println(files?.size ?: "empty")

    var values = mapOf("11" to null)
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")

    val value = null
    value?.let {
        // 代码会执行到此处, 假如data不为null
    }

    fun test() {
        val result = try {
            1
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }

        // 使用 result
    }

    fun foo(param: Int) {
        val result = if (param == 1) {
            "one"
        } else if (param == 2) {
            "two"
        } else {
            "three"
        }
    }

    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }

    fun theAnswer() = 42

    class Turtle {
        fun penDown() {}
        fun penUp() {}
        fun turn(degrees: Double) {}
        fun forward(pixels: Double) {}
    }

    val myTurtle = Turtle()
    with(myTurtle) {
        // 画一个 100 像素的正方形
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

    val myRectangle = Rectangle().apply {
        width = 4
        height = 5
    }

    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }

    val b: Boolean? = null
    if (b == true) {

    } else {
        // `b` 是 false 或者 null
    }

    var a11 = 1
    var b11 = 2
    a11 = b11.also { b11 = a11 }


    fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")
}