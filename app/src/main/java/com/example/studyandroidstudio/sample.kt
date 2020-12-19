package com.example.studyandroidstudio

fun main(){
    hellowworld()

    println(add(4, 5))

    //3. String Templete
    val name = "재현"
    println("my name is ${name}")
}

fun hellowworld() : Unit {
    println("hellow world!")
}

fun add(a: Int, b: Int): Int {
    return a+b
}

//2. val vs var
//val = value 상수
//var = 변하는수

fun sample(){
    val a : Int = 10
    var b : Int = 20

    //a = 1 //불가능

    val c = 100
    var d = 200

    var name = "재현"//string 인식 가능
}



