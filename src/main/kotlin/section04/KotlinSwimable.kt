package com.section04

interface KotlinSwimable {

    val swimAbility: Int

    // 코틀린은 구현시 디폴트, 아니면 그냥 추상
    fun act(){
        println("첨벙")
    }
}