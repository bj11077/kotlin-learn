package com.section02

import section02.Person


fun main() {

    val person = Person("공발자")

    /*
    해당값이 nullable이기 때문에 문제가 발생 컴파일불가
    - @NOTNULL 이면 가능
    - 간단히 말해 코틀린은 자바 어노테이션을 이해함
    - 만약 NULLABLE등의 어노테이션이 없는 자바코드면 플랫폼타입이라고해서 런타임에러가 발생할수있음
    - 자바코드와 혼용시 NULL 처리 잘해주어야함 (자바코드단에서)
     */
//    startsWithAA(person.name)

}

fun startsWithAA(str: String): Boolean{
    return str.startsWith("AA")
}