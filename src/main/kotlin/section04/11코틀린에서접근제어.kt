package com.section04

fun main(){

    /*
    코틀린의 접근제어자
    - 코틀린은 패키지가 접근제어에 영향을 주지않음
    - 코틀린은 기본 접근제어가 public

    1. public - 모든곳에서 접근
    2. protected - 선언된 클래스또는 하위
    3. internal -  같은 모듈에서만 접근가능 (모듈은 한번에 컴파일 되는 코틀린 코드 )
    4. private - 선언된 클래스내에서만 접근 가능
     */


}

// 기본값이 public
public val a = 3

// protected는 파일 최상단에 사용불가
//protected val b = 3



// 디폴트생성자에 접근제어를 주고싶으면 이렇게  접근제어 constructor() 명시가 필요
class Cat private constructor(){
}



// 세터만 private 처리시 저런식으로 도 가능
class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
){

    var price = _price
        private set

}