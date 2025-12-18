package com.section04.section04

import com.section04.Base

class Derived(
    override val number: Int = 100
): Base(number) {
    init {
        println("Derived init")
    }
}