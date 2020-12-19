package com.example.studyandroidstudio





open class Human(val name : String = "Any"){ //생성자

    fun eating(){
        println("hungry")
    }
}

class Korean : Human(){ //상속

}



fun main(){
    val Korean= Human("kiku")
    Korean.eating()

    println("my name is ${Korean.name}")
}

