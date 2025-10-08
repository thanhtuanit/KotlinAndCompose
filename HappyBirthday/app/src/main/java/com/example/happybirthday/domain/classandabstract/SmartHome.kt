package com.example.happybirthday.domain.classandabstract

class SmartHome {
}

fun main(){
//    var tiviDevice = SmartTvDevice("SamSung","tivi")
//    var lightDevice = SmartLightDevice("Điện quang", "đèn")
//
//    tiviDevice.turnOn()
//    tiviDevice.getDeviceInfo()
//    lightDevice.turnOn()
//    lightDevice.getDeviceInfo()

//    val morningNotification = 51
//    val eveningNotification = 135
//
//    printNotificationSummary(morningNotification)
//    printNotificationSummary(eveningNotification)

    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages >= 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    } else{
        println("You have $numberOfMessages notifications.")
    }

}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    var price = when {
        age in 0.. 12 -> 15
        age in 12.. 60 && isMonday -> 25
        age in 12.. 60 -> 30
        age > 60 -> 20
        else -> -1
    }
    return  price
}