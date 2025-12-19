package com.section04


fun main(){
    val dto1 = PersonDto("홍길동", 20)
    val dto2 = PersonDto("홍길동", 20)
    println(dto1 == dto2)

}

// equals, hashCode, toString 자동으로 만들어줌  like record
data class PersonDto(
    val name: String,
    val age: Int
)

// else안써도되고 enum추가되면 알려줌
fun handleCountry(country: KotlinCountry){
    when(country){
        KotlinCountry.KOREA -> println("한국")
        KotlinCountry.AMERICA -> println("미국")
    }
}

// enum class
enum class KotlinCountry(
    private val code:String
){
    KOREA("KO"),
    AMERICA("US")
    ;

}