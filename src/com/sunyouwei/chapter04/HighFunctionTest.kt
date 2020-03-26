package com.sunyouwei.chapter04

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {
    var lock = ReentrantLock()
    lock(lock) {

    }

    val ints = arrayListOf(1, 2, 3, 4)
    val doubled = ints.map { i -> i * 2 }
    println(doubled)
}