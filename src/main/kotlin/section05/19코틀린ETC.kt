package com.section05




fun main(){
    /*
    type alias
    긴 이름의 클래스 혹은 함수 타입이 있을때 축약하기 위해 사용


    as import
    이름중복된 각클래스의 메소드를 가져올때 다른이름으로 설정해줄수있음 파이썬처럼

    import Person as PP
     */

    /*
    구조분해와 componentN 함수
    내부 분해가능 (data class)
     */
    val awesomeClass = AwesomeClass("same", 1223)
    val (name,age) = awesomeClass
    // 변수당 componentN이 생김
    awesomeClass.component1()
    awesomeClass.component2()


    //foreach는 기본적으로 continue break 불가, break 사용하려면 run절, continue는 jump절 하지만 비추 걍 for문써라
    val numbers = listOf(1,2,3)
    numbers.map { it + 1 }
        .forEach { println(it) }


    /*
    break
     */
    run {
        numbers.map { it + 1 }
            .forEach { number ->
                if(number == 2){
                    return@run
                }
            }
    }


    /*
    continue
     */
    numbers.map { it + 1 }
        .forEach { number ->
            if(number == 2){
                return@forEach
            }
        }

    /*
    코틀린도 라벨링이 가능
    for가 밖의 for가 꺼지게하기
    근대이거도 쓰지마
     */

   abc@ for (i in 1..10){
        for (j in 1..10){
            if(j == 3){
                break@abc
            }
            println("$i $j")
        }
    }

    /*
    TakeIf
    - 주어진 조건이 만족하면 그 값이, 그렇지 않으면 null 반환
    TakeUnless

     */

    // 확인 이거왜안됨
//    numbers.takeIf { it-<= 0}


}



/*
파이썬같음
 */
typealias FruitFilter = (Fruit)-> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter): List<Fruit>{
    return fruits.filter(filter)
}

/*
이름 축약하고 싶을때도 사용
 */
data class UltraSuperGuardianTribe(
    val name: String
){}

typealias USGTMap = Map<String,UltraSuperGuardianTribe>



data class AwesomeClass(
    val name: String,
    val age:Int
)
// 이렇게 구조분해 수동으로가능 data class 아니어도
 class NotUltraSuperGuardianTribe(
    val name: String
){
     operator fun component1() = name
 }