package com.section03

fun main() {

    /*
    반복문
    1. for-each
    2. 전통 for문
    3. Progression 과 Range
    4. while문
     */

    // listOf 컬렉션
    val numbers = listOf(1,2,3,4,5)

    /*
    향상 for문 (for each)
     */
    // in을 사용함
    for(number in numbers){
        println(number)
    }

    /*
    전통 for문
    추가정보
    1..3은 등차수열(rangeTo)
     */
    for(i in 1..3){
        println(i)
    }


    /*
    전통 for문 -- 로
     */
    for(i in 3 downTo 1){
        println(i)
    }

    /*
    전통 for문 2씩 올리기 (step으로 사용함)
 */
    for(i in 1..5 step 2){
        println(i)
    }


    /*
    코틀린 while문  (완전동일)
     */
    var i = 1;
    while(i <= 5){
        println(i)
        i++
    }


}