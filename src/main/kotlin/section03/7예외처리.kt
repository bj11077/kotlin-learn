package com.section03

fun main() {

    /*
    예외처리
    1. try catch finally 구문
    2. checked exception 과 unchecked exception
    3. try with resources
     */

    // 코틀린은 다 unCheckedException이라 편함     FilePrinter 클래스 참조
    val printer = FilePrinter();
    printer.readFile()






}

// try-catch
fun parseIntOrThrow(str: String): Int{
    try {
        return str.toInt()
    }catch (e: NumberFormatException){
        throw IllegalArgumentException("${str}은 숫자가 아닙니다")
    }
}


// 값없으면 null을 반환할떄
// try catch 를 리턴문으로도 가능
fun parseIntOrThrowV2(str: String): Int?{
    return try {
        str.toInt()
    }catch (e: NumberFormatException){
        null
    }
}