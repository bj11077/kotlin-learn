package com.section04

// 코틀린은 상위클래스 생성자 우선 호출필요
class KotlinCat(
    species: String
) : KotlinAnimal(species, 4) {

    // abstract 구현  override 필수로 붙여야함
    override fun move() {
        println("사뿐사뿐")
    }
}