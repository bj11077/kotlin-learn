package com.section02

import section02.Person


fun main() {
    // 재할당가능 not final
    var number1 = 10L

    // 재할당 불가능 final
    val number2 = 20L


    // 가능 재할당
    number1 = 100L

    // 불가능 final임
    // number2 = 10L;

    /*
    초기값 지정해주지않으면 타입을 확정해줘야함
     */
    val number3 : Long;

    /*
    코틀린에서는 원시타입과 참조타입은 내부적으로 특별하게 동작해서 구분할 필요없음
    - 원시던말던 알아서해줌
     */
    val number4 : Long

    /*
    NULL 처리 법
    - 기본적으로 모든 변수가 NULL이 들어갈수없게 설계됨
    - NULL이 들어가는 타입일시 ? 를 설정
     */
    var number5 : Long? = 1_000L;

    /*
    new 필요없이 할당가능   자바의 person 객체를 가져왓음
     */
    var person = Person("홍길동")


    /*
    safe call test
     */
//    val safeCall: String? = "NOT NULL"
    val safeCall: String? = null

    /*
    이렇게  safeCall?.length로 하면   safeCall.length가 null이 아니면 값을 출력하고 null이면 그냥 전체가 null이됨 (length를 실행하지않음)
     */
    println(safeCall?.length)

    /*
    safe call과 elvis 연산자
    - 앞의 연산 결과가 null 이면 뒤의 값을 사용함
    null이면 0을 출력
     */
    println(safeCall?.length ?: 0)


}

/*
Null 일수도 있는 필드가 들어오지만 절대 Null이 아니라고 단언해주는 코드 !!
- ex) 디비에 create_time 같은거 처음엔 null이지만 이후부터는 null이  절대아니니까 단언가능
 */
fun isNeverNull(str: String?): Boolean {
    return str!!.startsWith("A")
}


/*
Elvis 연산을 조기 리턴문에서도 사용가능함
 */
fun calculate(number: Long?): Long {
    number ?:  return 0

    return  5;
}


fun startsWithA1(str: String?): Boolean {
    if(str == null){
        throw IllegalArgumentException("null이야")
    }
    return str.startsWith("A")
}

/*
위에껄 더 간결하게만듬
 */
fun startsWithA1Elvis(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("널널")
}


fun startsWithA2(str: String?): Boolean? {
    if(str == null){
        return null;
    }
    return str.startsWith("A")
}

/*
safe call이 아니면 막음
 */
fun startsWithA3(str: String): Boolean {
    return str.startsWith("A")
}




//// dto
//class section02.Person(val name:String)

