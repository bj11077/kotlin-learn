package com.section03

fun main() {

    /*
    함수다루기
    1. 함수선언 문법
    2. default parameter
    3. named argument(parameter)
    4. 같은 타입의 여러 파라미터 받기 (가변인자)
     */


    // 이런식으로 줘도됨
    repeat("hello")
    repeat("hello", 3,false)

    //3. named argument(parameter) , 자바 메소드는 네임드 argument 사용불가
    repeat("hello", useNewLine = false)

    //4. 가변인자
    var array = arrayOf("a","b","c")
    // 스프레드연산자라는걸로 넣어줌
    printAll(*array)


}

// = 로 표현도 가능함 타입스크립트인듯 추론가능해서 타입 생략도 가능
fun max(a: Int, b: Int) = if(a>b) a  else b

// 코틀린은 디폴트 파라미터 줄수잇음
fun repeat(str:String, num: Int =3, useNewLine: Boolean = true){
    for (i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

// vararg로 String... 느낌냄
fun printAll(vararg strings: String){
    for (str in strings){
        println(str)
    }
}