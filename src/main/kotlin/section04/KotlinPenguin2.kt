package com.section04

// 코틀린은 상위클래스 생성자 우선 호출필요
// extends나 implements의 구분이 없음
class KotlinPenguin2(
    species: String
) : KotlinAnimal(species, 2), KotlinSwimable, KotlinFlyable {


    protected val wingCount: Int = 2

    // abstract 구현  override 필수로 붙여야함
    override fun move() {
        println("팍팍")
    }

    override val legCount: Int
        get() = wingCount * 2


    // 상위클래스꺼 제네릭으로 제대로 지정해줘야됨
    override fun act() {
        super<KotlinSwimable>.act()
        super<KotlinFlyable>.act()
    }

    override val swimAbility: Int
        get() = 3


}
