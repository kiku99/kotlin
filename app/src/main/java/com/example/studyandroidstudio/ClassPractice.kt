package com.example.studyandroidstudio


// 1. Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수가 있다.
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}


val square : (Int) -> (Int) = {number -> number*number}

val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}


fun main(){
    println(square(12))
    println(nameAge("kiku", 23))

    val lamda = {number : Double ->
            number == 4.456
    }
    println(invokeLamda(lamda))
}

// 확장함수
fun extendString(name : String, age : Int) : String {

    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 Return

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "good"
        else -> "error"
    }
}

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean{
    return  lamda(5.234)
}

