package com.example.happybirthday.domain.classandabstract

data class Event(
    var title: String, var description: String?, var dayPart: Daypart, var duration: Int
)

enum class Daypart{
    MORNING, AFTERNOON, EVENING
}

fun main() {
    val instance = Event(
        "Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", Daypart.EVENING, 15
    )

    println("Event(title=${instance.title}, description=${instance.description}, daypart=${instance.dayPart}, durationInMinutes=${instance.duration})")
}