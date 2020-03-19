package com.sunyouwei.chapter02


fun main(args: Array<String>) {
    val letterchar: Char = 'a'
    val nubchar: Char = '0'
    val unicodechar: Char = '\u7231'
    val yi: Char = '\n'
    val maxchar = Char.MAX_VALUE
    val minchar = Char.MIN_VALUE
    println("转义字符${yi} 字母，char类型${letterchar},数字char 类型${nubchar},Unicode 编码char类型：${unicodechar}")
    println("max char:${maxchar}")
    println("min char:${minchar}")
}