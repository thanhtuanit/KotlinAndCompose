package com.example.happybirthday.ui.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.R
import com.example.happybirthday.domain.classandabstract.ArtItem
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue


@Composable
fun ArtSpaceLayout(modifier: Modifier = Modifier) {
    val artItems = listOf<ArtItem>(
        ArtItem(
            R.drawable.art_1, "Still Life of Blue Rose and Other Flowers", "Owen Scott ", "(2021)"
        ),
        ArtItem(R.drawable.art_2, "The title of art 2", "Owen", "(2022)"),
        ArtItem(R.drawable.art_3, "The title of art 2", "Owen", "(2023)")
    )

    var currentIndex by remember { mutableStateOf(0) }

    Column(modifier = modifier.padding(16.dp)) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 64.dp, bottom = 64.dp)
                .weight(0.8f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .padding(top = 32.dp)
                    .shadow(8.dp, RoundedCornerShape(12.dp), clip = false)
            ) {
                Image(
                    painter = painterResource(artItems[currentIndex].image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(64.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
                .weight(0.1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFECEBF3))
                    .padding(start = 16.dp, end = 16.dp), verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = artItems[currentIndex].title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W300,
                    modifier = Modifier.fillMaxWidth()
                )

                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = artItems[currentIndex].author,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = artItems[currentIndex].since,
                        fontSize = 12.sp,
                    )
                }
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
                .weight(0.1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    if (currentIndex > 0) {
                        currentIndex--
                    }
                },
                modifier = Modifier.width(150.dp),
                enabled = currentIndex > 0
            ) {
                Text(
                    text = "Previous"
                )
            }
            Button(
                onClick = {
                    if (currentIndex < artItems.size - 1) {
                        currentIndex++
                    }
                },
                enabled = currentIndex < artItems.size - 1, modifier = Modifier.width(150.dp)
            ) {
                Text(
                    text = "Next"
                )
            }
        }
    }
}