package com.sunyouwei.chapter02

fun main(args: Array<String>) {
    val getuname: String = "Kotlin"
    val getpwd: String = "password"
    var getstatus: Boolean? = true
    var db = arrayListOf("Kotlin", "password")
    if (getuname != db[0]) {
        println("用户名不存在")
    }
    if (getpwd != db[1]) {
        println("密码错误")
    }
    if (getuname == db[0] && getpwd == db[1]) {
        var str = if (getstatus!!) 1 else 0
        if (str == 1) {
            println("登录成功，下次进入自动登录状态")
        } else {
            println("登录成功，下次登录请重新录入账户和密码")
        }
    }

    var a = 0
    var b = 1
    var max = a
    if (a < b) max = b

// With else

    if (a > b) {
        max = a
    } else {
        max = b
    }

// 作为表达式
    val max2 = if (a > b) a else b


    val max3 = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(max3)

    var x = 1
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // 注意这个块
            print("x is neither 1 nor 2")
        }
    }

    var max4 = when (x) {
        -1 -> {
            0
        }
        0 -> {
            1
        }
        in 0..10 -> {
            2
        }
        else -> {
            3
        }
    }
}