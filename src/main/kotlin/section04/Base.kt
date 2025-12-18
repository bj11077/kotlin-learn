package com.section04

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base init")
        println(number)
    }
}