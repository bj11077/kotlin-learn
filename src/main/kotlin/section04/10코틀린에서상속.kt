package com.section04

import com.section04.Derived

// 하위에서 오버라이드가능한 프로퍼티를 생성자나 init 블럭에 만들지말자 (open 피하기)
/*
상속 키워드

1. final : override 금지
2. open : override 열어줌
3. abstract : override 필수
4. override : 상위 오버라이드하고있다
 */
fun main(){
    Derived(300)
}


open class Base(
    open val number: Int = 100
) {
    init {
        println("Base init")
        println(number)
    }
}



class Derived(
    override val number: Int = 100
): Base(number) {
    init {
        println("Derived init")
    }
}