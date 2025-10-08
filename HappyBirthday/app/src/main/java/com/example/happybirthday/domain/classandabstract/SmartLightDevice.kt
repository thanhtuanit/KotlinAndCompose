package com.example.happybirthday.domain.classandabstract

class SmartLightDevice(lightName: String, lightCategory: String) :
    SmartDevice(lightName, lightCategory) {
    override fun turnOn() {
        println("the light $name is on")
    }

    override fun turnOff() {
        println("the light $name is off")
    }
}