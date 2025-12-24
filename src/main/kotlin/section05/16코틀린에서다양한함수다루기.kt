package com.section05

import section05.JavaPerson3

fun main(){
/*
확장가능
fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {}

- 또한 private or protected는 확장이 불가능함


 **확장함수는 현재타입 기준으로 호출됨**
- 자바에서는 확장함수를 정적함수처럼 사용함

 */

    val str = "hello"
    println(str.lastChar())


    /*
    자바에서는 멤버함수가 우선적으로 ㅊ풀력되고 확장은 무시됨
     */
    val javaPerson3 = JavaPerson3("11", "", 33)
    javaPerson3.nextYearAge()


    // train의 확장함수 호출
    val train = Train()
    train.isExpensive()


    // train 확장함수 호출
    val srt1: Train = Srt()
    srt1.isExpensive()

    // srt의 확장함수 호출
    val srt2: Srt = Srt()
    srt2.isExpensive()




    /*
    중위함수
    - infix 함수 dsl느낌낼수있ㄴ느것
     - inline 함수 : 함수가 호출되는 대신 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우
        . 함수 파라미터 오버헤드 줄이기위해 사용
        . 성능측정과 함께 신중하게 사용해야함
     */

    //기본함수
    3.add(5)

    //infix 함수 dsl느낌
    3 add2 5


}

fun String.lastChar(): Char {
    return this[this.length - 1]
}


fun JavaPerson3.nextYearAge(): Int{
    return this.age + 1
}


open class Train(
    val name: String = "새마을기차",
    val price: Int = 100000,
)

fun Train.isExpensive(): Boolean{
    println("나는 트레인")
    return price > 1000000
}

class Srt: Train("SRT",40000)

fun Srt.isExpensive(): Boolean{
    println("나는 SRT")
    return price > 1000000
}

fun Int.add(other: Int): Int{
    return this + other
}

infix fun Int.add2(other: Int): Int{
    return this + other
}

//로직을 붙여넣을수가있음
inline fun Int.add3(other: Int): Int{
    return this + other
}

