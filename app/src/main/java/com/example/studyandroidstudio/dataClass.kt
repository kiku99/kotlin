package com.example.studyandroidstudio

data class  Tickets(val companyName : String, val name : String, var date : String, var seatNumber : Int)




fun main(){
    val ticketA = Tickets("koreanAir", "kiku", "2020-02-26", 14)
}