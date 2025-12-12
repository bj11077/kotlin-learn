package com.section03

fun main() {

    /*
    1. if문
    2. Expression과 Statement
    3. switch 와 when
     */

}


/*
if문
 */
fun validateScoreIsNotNegative(score: Int) {
    if(score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다")
    }
}

/*
if / else 동일

하지만 코틀린에서는 if가 expression
if lese를 바로 리턴가능함
** 3항연산자가 그래서 없음 **
 */
fun getPassOrFail(score: Int): String{
    return if(score >= 50){
        "p"
    }else{
        "f"
    }
}

/*
if / else if / else 도 동일
 */
fun getGrade(score: Int): String{
    return  if(score >= 90){
        "A"
    } else if(score >= 80){
        "B"
    }else{
        "C"
    }
}


/*
0<= a  && a <= 100 을 이렇게 표현할수도있음

 */
fun validateScoreIsIn100(score: Int) {
    if(score in 0..100){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다")
    }
}

/*
코트린에서 switch는 없음, 대신 when을 사용함
 */
fun getGradeWithSwitch(score: Int): String{
    return when(score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
}

/*
instance 확인도 이렇게 편하게 자동 스마트캐스팅해서 가능
 */
fun startsWithA(obj: Any): Boolean{
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int){
    when(number){
        1,0,-1 -> println("어디서 많이본 숫자")
        else -> println("1,0,-1 이 아님")
    }
}

fun judgeNumber2(number: Int){
    when{
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}
