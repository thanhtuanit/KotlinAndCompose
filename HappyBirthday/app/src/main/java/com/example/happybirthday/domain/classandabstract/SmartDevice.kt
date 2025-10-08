package com.example.happybirthday.domain.classandabstract

/**
 *
 */
open class SmartDevice(val name: String, val category: String) {
    /**
     *
     */
    fun getDeviceInfo(){
        println("Device name: $name, device category: $category")
    }

    open fun turnOn(){
        println("Device name: $name is on")
    }

    open fun turnOff(){
        println("Device name: $name is off")
    }
}