package com.sunyouwei.chapter02

fun main(args: Array<String>) {
    val (status, msg) = Pair(404, "Not Found")
    val (server, script, database) = Triple("Tomcat", "PHP", "MySql")

    println("方式一：访问${server}+${script}+${database}环境，反馈得到状态码${status},表示${msg}")

    val http = Pair(404, "not found")
    val development = Triple("Tomcat", "PHP", "MySql")

    println("方式二：访问${development.first}+${development.second}+${development.third}环境，反馈得到状态码${http.first},表示${http.second}")
}