package com.section03

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    fun readFile(){
        val cureentFile = File(".")
        val file = File(cureentFile.absolutePath+"/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    // try with resources가 사라지고 use를 사용함
    fun readFile(path: String){
        BufferedReader(FileReader(path)).use {
            reader ->  println(reader.readLine())
        }
    }

}