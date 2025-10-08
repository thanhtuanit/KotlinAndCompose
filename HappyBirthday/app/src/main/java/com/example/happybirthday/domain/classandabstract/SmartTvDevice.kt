package com.example.happybirthday.domain.classandabstract

class SmartTvDevice(val tvName: String, tvCategory: String) : SmartDevice(tvName, tvCategory) {
    var speakerVolume: Int = 2
        set(value) {
            if (value in 0..100) {
            field = value
            }
        }

    var numberChanel: Int = 1

}