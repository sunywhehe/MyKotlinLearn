package com.sunyouwei.chapter02

var int: Int = 8
var teint: Int = 0x88888
var maxint: Int = Int.MAX_VALUE
var minint: Int = Int.MIN_VALUE
var long: Long = 128L
var maxlong: Long = Long.MAX_VALUE
var minlong: Long = Long.MIN_VALUE
var double: Double = 2.88
var maxdouble: Double = Double.MAX_VALUE
var mindouble: Double = Double.MIN_VALUE
var float: Float = 2.0f
var maxfloat: Float = Float.MAX_VALUE
var minfloat: Float = Float.MIN_VALUE
var maxshort: Short = Short.MAX_VALUE
var minshort: Short = Short.MIN_VALUE
var maxbyte: Byte = Byte.MAX_VALUE
var minbyte: Byte = Byte.MIN_VALUE

fun main(args: Array<String>) {
    println("int 十进制:${int}")
    println("int 十六进制:${teint}")
    println("int max:${maxint}")
    println("int min:${minint}")

    println("long  :${long}")
    println("long  max:${maxlong}")
    println("long  min:${minlong}")

    println("double  :${double}")
    println("double max  :${maxdouble}")
    println("double min  :${mindouble}")

    println("float  :${float}")
    println("float max :${maxfloat}")
    println("float  min:${minfloat}")

    println("short max :${maxshort}")
    println("short min  :${minshort}")

    println("byte max  :${maxbyte}")
    println("byte min  :${minbyte}")

}
