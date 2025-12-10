package com.section02

import section02.JavaMoney


fun main() {
    /*
    1. 단항연산자 / 산술 연산자
    2. 비교 연산자아 동등성, 동일성
    3. 논리 연산자 / 코틀린에 있는 특이한 연산자
    4. 연산자 오버로딩
     */

    val money1 = JavaMoney(2_000L);
    val money2 = JavaMoney(1_000L);

    /*
    코틀인에서는 비교 연산자시 자동으로 compareTo를 호출해줌
     */
    if(money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다")
    }

    /*
    비교 연산자
    동등성 / 동일성
    동등성 : ==  (equals)
    동일성 : ===  (주소값)
     */
    val jmoney1 = JavaMoney(1_000L);
    val jmoney2 = jmoney1;
    val jmoney3 = JavaMoney(1_000L);

    // 동일성 (주소)  true / false
    println(jmoney1 === jmoney2)
    println(jmoney1 === jmoney3)


    // 동등성 equals   true / true
    println(jmoney1 == jmoney2)
    println(jmoney1 == jmoney3)


    /*
    논리 연산자
       && || 동일함
     */
    if(fun1() || fun2()){
        println("나온다")
    }


    if(fun1() && fun2()){
        println("왜안나와")
    }

    /*
    **코틀린에 있는 논리 연산자**
    - in / !in
      = 컬렉션이나 범위에 포함되어 있다, 있지 않다
    - a..b
      = a부터 b 까지의 범위 객체를 생성한다
    - a[i]
      = a에서 특정 index i 로 값을 가져온다

    - a[i] = b
      = a의 특정 인덱스 i 에 b 를 넣는다
     */

    /*
        코틀린
        - 코틀린에서는 객체마다 연산자를 직접 정의할수도있음!!
     Money 클래스 plus 참조
     */
    val Kmoney1 = Money(100L)
    val Kmoney2 = Money(200L)

    //Money(amount=300)
    println(Kmoney1 + Kmoney2)



}


fun fun1(): Boolean{
    println("fun 1")
    return true
}

fun fun2(): Boolean{
    println("fun 2")
    return false
}
