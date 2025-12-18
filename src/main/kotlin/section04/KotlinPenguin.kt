package com.section04

// 코틀린은 상위클래스 생성자 우선 호출필요
class KotlinPenguin(
    species: String
) : KotlinAnimal(species, 2) {


    protected val wingCount: Int = 2

    // abstract 구현  override 필수로 붙여야함
    override fun move() {
        println("팍팍")
    }

    override val legCount: Int
        get() = wingCount * 2
}
