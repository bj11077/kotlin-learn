package com.section04

class KotlinPerson2 private constructor(
    private val name: String,
    private val age: Int
) {

    // static을 이렇게씀  그냥 object로도 가능하고 이름도 줄수잇음
//    companion object {
        companion object Factory : KotlinLog{

        //  const는 컴파일시점에 할당, 아니면 런타임에 할당 찐 상수는 이렇게 처리함
        private const val MIN_AGE = 0

        // 이거 사용하면 Person2.newBaby()로 호출 가능함 없다면 Person2.Companion.newBaby()로 호출해야함
        @JvmStatic
        fun newBaby(name: String): KotlinPerson2{
            return KotlinPerson2(name, MIN_AGE)
        }

        override fun log() {
            println("log in")
        }
    }

}