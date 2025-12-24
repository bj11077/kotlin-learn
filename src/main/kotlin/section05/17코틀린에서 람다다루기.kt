package com.section05

import java.io.BufferedReader
import java.io.FileReader


fun main(){

    val fruits = listOf(
        Fruit("apple", 1000),
        Fruit("banana", 2000),
        Fruit("apple", 1400),
        Fruit("banana", 3000),
        Fruit("apple", 1300),
        Fruit("banana", 4000),
        Fruit("apple", 1100),
        Fruit("banana", 5000),
        Fruit("수박", 2000))



    //익명함수 활용 인자는 그대로 () 에 주고 익명함수는 중괄호에 뺄수도잇음
    // it으로 애로우펑션도 생략가능
    filterFruits(fruits, {fruit -> fruit.name == "apple"})
    filterFruits(fruits) {fruit -> fruit.name == "apple"}
    filterFruits(fruits) {it.name == "apple"}


    /*
    Closure

    자바에서는 람다안에 final을 넣어야하지만 코틀린은 가변값도 가능
     */

    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) {it.name == targetFruitName}


    /*
    try with resources

    use 함수를 사용했음 (Closable 확장)
     */



}


class Fruit(val name: String, val price: Int)



// 람다1
val isApple = fun(fruit: Fruit): Boolean{
    return fruit.name == "apple"
}

//람다2
val isApple2:(Fruit)-> Boolean = { fruit: Fruit -> fruit.name == "apple"}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit>{
    val results = mutableListOf<Fruit>()
    for (fruit in fruits){
        if (filter(fruit)){
            results.add(fruit)
        }
    }
    return results
}

/*
try with resource
 */
fun readFile(path: String){
    BufferedReader(FileReader(path)).use {
        reader -> println(reader.readLine())
    }
}