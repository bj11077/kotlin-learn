package com.section04

fun main(){

}


// static으로 가져오는 best practice
class KotlinHouse(
    private val address: String,
    private val livingRoom: LivingRoom
){
    class LivingRoom(
        private val area: Double
    )
}


// worst practice 직접참조 및 외부 참조
class BadHouse(
    private val address: String,
    private val livingRoom: LivingRoom
){
    inner class LivingRoom(
        private val area: Double
    ){
        val address: String
            get() = this@BadHouse.address
    }
}
