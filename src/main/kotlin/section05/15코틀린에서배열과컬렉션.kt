package com.section05


fun main(){

    /*
    코틀린 배열
     */
    val array = arrayOf(100,200)

    for (i in array){
        println(i)
    }

    // 자바스크립트처럼도 가능
    for ((idx,value) in array.withIndex()){
        println("$idx : $value")
    }


    /*
    ### 리스트 ###
     */


    //추론가능하면 괜찮음
    val numbers = listOf(100,200)

    // 빈배열은 제네릭강제
    val emptyList = emptyList<Int>()

    printNumbers(emptyList());


    // 배열처럼 가져올수있음 리스틋에서
    println(numbers[0])

    for (number in numbers){
        println(number)
    }

    for ((idx,number) in numbers.withIndex()){
        println("$idx $number")
    }


    /*
    ### MAP ###
     */

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"

    // 이런식으로초기화가능함
    mapOf(1 to "MONDAY")

    for(key in oldMap.keys){
        println(key)
    }

    //value 만도가능
    for(value in oldMap.values){
        println(value)
    }

    // key value 둘다도 가능
    for((key,value) in oldMap.entries){
        println("$key : $value")
    }


}


private fun printNumbers(numbers: List<Int>){
}