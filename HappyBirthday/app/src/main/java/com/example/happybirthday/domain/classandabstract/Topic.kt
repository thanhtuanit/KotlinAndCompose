package com.example.happybirthday.domain.classandabstract

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val topicTitle: Int,
    val availableCourses: Int,
    @DrawableRes val topicImage: Int
) {

}