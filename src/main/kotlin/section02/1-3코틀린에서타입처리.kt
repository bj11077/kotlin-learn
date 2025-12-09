package com.section02

import section02.Person


fun main() {

    /*
    1. 기본타입
    - 자바의 object = Any
    - Unit은 자바의 void , 차이점은 자바에서는 Void로 만들어야 제네릭되지만 Unit은 그자체로 제네릭사용가능
    - Nothing은 함수가 정상적으로 끝나지않았다는걸 표현하는 역할, 무조건 예외 반환, 리턴타입
    2. 타입 캐스팅
    3. 코틀린의 3가지 특이한 타입
    4. String interpolation, String indexing
     */

    /*
    코틀린은 암시적 형변환 불가
     */
    val number1 = 3;

    /*
    형변환 자동으로 안됨
    명시적으로 toLong 등을 처리해줘야됨
     */
//    val nuber2: Long = number1;
    val nuber2: Long = number1.toLong();


    /*
    형변환도 null처리 꼭해줘야됨
     */
    val int1: Int? = 3;
    val long1: Long = int1?.toLong() ?: 0L;


    printAgeIfPerson3(Person("",100))



    /*
    코틀린 기준 string
    ${변수명}으로 가능
     */
    println("hello ${int1}")

    /*
    코틀린 여러줄 문자열
    자바랑 동일 """
     */
    val fsdf = """
        abc
        def
    """.trimIndent()
    println(fsdf)

    /*
    chartAt 안쓰고 문자열의 특정값을 가져올수있음
     */
    val someABC = "ABC";

    // A
    println(someABC[0])

    // C
    println(someABC[2])
}


/*
instance OF랑 비슷함
 */
fun printAgeIfPerson(obj: Any){
    if(obj is Person){
        val person = obj as Person
        println(person.age)
    }
}

/*
만약 is not instance of로 처리하고싶으면 is앞에 ! 로 처리
 */
fun printAgeIfPerson2(obj: Any){
    if(obj !is Person){
        println(obj)
    }
}


/*
만약 조건문으로 obj가 null이 아니면 person타입으로 변환시키고 아니면 전체 null만들려면
 */
fun printAgeIfPerson3(obj: Any?){
   val person = obj as? Person
    println(person?.age)
}