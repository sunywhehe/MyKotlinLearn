package com.sunyouwei.chapter03

val emptymap = emptyMap<Int, String>()
val map = mapOf(1 to "one", 2 to "two", 3 to "three")
val mmap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

val hashmap = hashMapOf(1 to "one", 2 to "two", 3 to "three")
val sortedmap = sortedMapOf(1 to "one", 2 to "two", 3 to "three")
val linkedmap = linkedMapOf(1 to "1", 2 to "2", 3 to "3")

fun main(args: Array<String>) {
    println(map.size)
    println(map.keys.toList())
    println(map.values.toList())

    println(map.entries)

    println(map.get(1))
    map.forEach { key, value ->
        println("key: ${key} ,value:${value}")
    }
    map.forEach { println("key: ${it.key} ,value:${it.value}") }
    if (!map.isEmpty()) {

    }

    if (map.containsKey(1)) {

    }
    if (map.containsValue("one")) {
    }
    println(mmap)

    mmap.put(4, "four")
    println(mmap)
    val addall = mapOf(5 to "five", 6 to "six")
    mmap.putAll(addall)
    println(mmap)
    mmap.remove(1)
    println(mmap)
    mmap.clear()
    println(mmap)
}