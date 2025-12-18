package com.section04

import section03.JavaPerson
import java.util.Locale.getDefault


fun main() {
    //getter /setter 구분이 없고 다 땡으로해서 가능
    val person = Person("홍길동", 20)
    println(person.age)
    // setter
    person.age=30
    println(person.age)

    // 자바의 getter setter도 이런식으로 처리한다
    val javaPerson = JavaPerson("홍길동2", 20)
    println(person.age)
    // setter
    person.age=30
    println(person.age)

    // 생성자
    val pperson = Person("홍길동3")


}



/*
getter/setter 무료
.. 코틀린에서는 부생성자보단 디폴트 파라미터를 추천함
.. 디폴트가 아니라면 정적 팩토리 메서드를 사용해라!
.. 만약 부생성자 호출시 아래부터 init 부터 아래로 내려와서 실행됨 (다른 부생성자의 바디가 실행되는것이 특이함)
 */
class Person (
//     name: String= "길동",
   // val var면 getter setter가 자동으로 생김
    name: String= "길동",
    var age: Int = 5
){

    // 커스텀 setter but 잘안씀
    var name = name
        set(value) {
            field = value.uppercase(getDefault())
        }

    // 클래스호출시 처리되는 특별할 블록
    init{
        if(age <= 0)
            throw IllegalArgumentException("age는 ${age} 일수 없습니다")
    }

    // 두번째 생성자 사용시 constructor 명시
    constructor(name: String): this(name, 1)

    //
    constructor(): this("길동")

    // 내부메서드만들때 방법이 여러가지
//    fun isAdult(): Boolean{
//        return age >= 20
//    }

    // 프로퍼티
    val isAdult: Boolean
        get() = age >= 20


    fun getUpperCaseName(): String{
        return name.uppercase(getDefault())
    }


    // backing field 는 쓰는경우가 드뭄
//    val name: String = name
//        get() = field.uppercase(getDefault())

}