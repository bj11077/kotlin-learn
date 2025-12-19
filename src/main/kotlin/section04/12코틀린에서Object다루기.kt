package com.section04


fun main(){

    /*
    코틀린에서의 싱글톤
    object를 앞에붙이면됨
     */

    //싱글톤
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)


    /*
    익명클래스
     */
    moveSomething(object : Movable{
        override fun move() {
            TODO("Not yet implemented")
        }

        override fun fly() {
            TODO("Not yet implemented")
        }

    })

}

object Singleton{
    var a: Int = 0
}

/*
익명클래스
 */
private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}



interface Movable{

    fun move()

    fun fly()
}