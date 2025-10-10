package com.example.happybirthday.domain.classandabstract

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * The class contain information of hero.
 * @param name Name of hero
 * @param description The basic info
 * @param imageHero Avatar
 */
data class Hero(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val imageHero: Int
) {
}