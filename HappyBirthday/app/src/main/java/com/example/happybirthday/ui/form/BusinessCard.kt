package com.example.happybirthday.ui.form

import android.graphics.RenderNode
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.R

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .background(Color(red = 209, green = 232, blue = 213))
    ) {
        Row(
            Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
        }
        Row(
            Modifier
                .weight(1.5f)
                .fillMaxWidth()
        ) {
            BusinessCardContent()
        }
        Row(
            Modifier
                .weight(0.8f)
                .fillMaxWidth()
        ) { }
        Row(
            Modifier
                .weight(0.7f)
                .fillMaxWidth()
        ) {
            BusinessCardFooter()
        }
    }
}

@Composable
fun BusinessCardContent() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(Color(red = 0, green = 48, blue = 65))
        )

        Text(
            text = "Trần Thanh Tuấn",
            fontSize = 32.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 16.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color(0xFF3ddc84)
        )
    }
}

@Composable
fun BusinessCardFooter() {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .weight(0.25f),
                contentAlignment = Alignment.CenterEnd
            ) {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                )
            }
            Text(
                text = "+84 8987333",
                fontSize = 16.sp,
                modifier = Modifier
                    .weight(0.75f)
                    .padding(start = 8.dp),
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .weight(0.25f),
                contentAlignment = Alignment.CenterEnd,
            ) {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                )
            }
            Text(
                text = "@AndroidDev",
                fontSize = 16.sp,
                modifier = Modifier
                    .weight(0.75f)
                    .padding(start = 8.dp),
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .weight(0.25f),
                contentAlignment = Alignment.CenterEnd
            ) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                )
            }
            Text(
                text = "thanhtuan@systemgear-vietnam.com",
                fontSize = 16.sp,
                modifier = Modifier
                    .weight(0.75f)
                    .padding(start = 8.dp),
            )
        }
    }
}