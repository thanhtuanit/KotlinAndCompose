package com.example.happybirthday.data

import com.example.happybirthday.R
import com.example.happybirthday.domain.classandabstract.Affirmation
import com.example.happybirthday.domain.classandabstract.Topic

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10))
    }

    fun loadTopics(): List<Topic> {
        val topics = listOf<Topic>(
            Topic(R.string.architecture, 58, R.drawable.architecture),
            Topic(R.string.automotive, 58, R.drawable.automotive),
            Topic(R.string.biology, 58, R.drawable.biology),
            Topic(R.string.crafts, 121, R.drawable.crafts),
            Topic(R.string.business, 78, R.drawable.business),
            Topic(R.string.culinary, 118, R.drawable.culinary),
            Topic(R.string.design, 423, R.drawable.design),
            Topic(R.string.ecology, 58, R.drawable.ecology),
            Topic(R.string.engineering, 58, R.drawable.engineering),
            Topic(R.string.fashion, 92, R.drawable.fashion),
            Topic(R.string.finance, 92, R.drawable.finance),
            Topic(R.string.film, 165, R.drawable.film),
            Topic(R.string.gaming, 164, R.drawable.gaming),
            Topic(R.string.geology, 164, R.drawable.geology),
            Topic(R.string.drawing, 326, R.drawable.drawing),
            Topic(R.string.history, 326, R.drawable.history),
            Topic(R.string.journalism, 326, R.drawable.journalism),
            Topic(R.string.lifestyle, 305, R.drawable.lifestyle),
            Topic(R.string.music, 212, R.drawable.music),
            Topic(R.string.painting, 172, R.drawable.painting),
            Topic(R.string.photography, 321, R.drawable.photography),
            Topic(R.string.tech, 118, R.drawable.tech)
        )
        return topics
    }
}