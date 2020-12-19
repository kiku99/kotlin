package com.example.studyandroidstudio

fun main(){

nullcheck()
}

//7. Nullable and NonNull

fun nullcheck(){

    var name = "kiku"
    var nullName : String? = null
    var nameInUpperCase : String = name.toUpperCase()
    var nullNameInUpperCase : String? = nullName?.toUpperCase()

    val lastName : String? = null

    val fullName :String = name+" "+ (lastName?: "NO LastName")
    println(fullName)
}

//!! 는 널타입이 확실하게 아닐 때 사용
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
}