package com.example.studyandroidstudio

fun main(){

    forAndWhile()
}

//4. 조건식

fun maxBy(a : Int, b : Int) : Int {
    if (a > b){
        return a
    }
    else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) : Int = if(a>b) a else b

fun checkNumber(score : Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        else -> println("i don't know")
    }

    when(score){
        in 90..100 -> println("You are genius")
        else -> println("okay")
    }
}

//5. Array and List

fun array(){
    val array :Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    val array2 :Array<Any> = arrayOf(1,"d",2,3)//list도 마찬가지

    array[0] = 3
    //list[0] = 3 list는 변경불가(읽기전용)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList[0] = 20

}

//6. For and While
fun forAndWhile(){
    val students = arrayListOf("jenny", "lisa", "rose", "jisu")

    for ( name in students){
        println("${name}")
    }

    var sum : Int = 0
    for ( i in 1..10){
        sum += i
    }

    var index = 0
    while (index < 10){
        println("current index = ${index}")
        index++
    }
}