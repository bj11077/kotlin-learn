package com.section02

data class Money(
    val amount: Long
) {
    // + 오퍼레이터 오버라이딩
    operator fun plus(money: Money): Money {
        return Money(amount + money.amount)
    }
}