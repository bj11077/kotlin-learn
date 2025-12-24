package com.section05

import com.section04.Person

fun main(){

    /*
    scope function이란?
    영역 함수
    - 람다를 사용해 일시적인 영역을 만들고 코드를 더 간결하게하거나 메소드체이닝하기위해 씀
    - let, run, with, apply, also
                    it사용    this 사용
    - 람다 결과값 :    let      run
    - 객체 그자체 리턴   also    apply
                    with
    확장함수는 본인 자신을 this로 호출하고 생략가능

    let : 하나 이상의 함수를 call chain 결과로 호출할때, non-null에서 코드블락, 일회성 변수
    apply : 중간에 객체 수정필요할때
     */

    val person = Ppeople("홍길동", 20)


    val value1 = person.let { it.age}
    val value2 = person.run { this.age }
    val value3 = person.apply { this.age }
    val value4 = person.also { it.age }

    val person2 = Person("홍길동", 20)
        with(person2){
            println(name)
            println(age)
        }
}




data class Ppeople(
    val name: String,
    val age: Int)