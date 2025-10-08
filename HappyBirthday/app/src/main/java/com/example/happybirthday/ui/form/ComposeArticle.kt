package com.example.happybirthday.ui.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.R

@Composable
fun ComposeArticle(modifier: Modifier = Modifier){
    Column (modifier) {
        GeneralImage()
        GeneralText()
    }
}

@Composable
fun GeneralImage () {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth

    )
}

@Composable
fun GeneralText(){
    Column {
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = stringResource(R.string.shortDescription),
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify

        )

        Text(
            text = stringResource(R.string.longDescription),
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}