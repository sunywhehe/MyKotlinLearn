package com.sunyouwei.chapter03

val emptyset = emptySet<String>()
val set = setOf(1, 2, 3)
val mset = mutableSetOf(1, 2, 3)
val hasset = hashSetOf(1, 2, 3)
val linkset = linkedSetOf(1, 2, 3)
val sortset = sortedSetOf(1, 2, 3)

fun main(args: Array<String>) {
    val sets = setOf(1, 2, 3, 4, 1, 2, 3, 4)
    sets.forEach(::println)

    println(mset)
    mset.add(4)
    println(mset)
    mset.remove(2)
    println(mset)
}