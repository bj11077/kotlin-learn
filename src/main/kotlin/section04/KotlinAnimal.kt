package com.section04

// 프로퍼티 getter등 재정의시 open 해줘야됨
abstract class KotlinAnimal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}