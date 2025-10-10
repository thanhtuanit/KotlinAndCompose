package com.example.happybirthday.ui.form

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.happybirthday.R
import com.example.happybirthday.data.Datasource
import com.example.happybirthday.domain.classandabstract.Hero

@Composable
fun HeroImage(@DrawableRes imageId: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(imageId),
        contentDescription = null,
        modifier.clip(MaterialTheme.shapes.small).height(72.dp)
    )
}

@Composable
fun HeroInfo(@StringRes name: Int, @StringRes description: Int, modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = stringResource(name),
            style = MaterialTheme.typography.displaySmall
        )
        Text(
            text = stringResource(description),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun HeroCard(hero: Hero, modifier: Modifier = Modifier) {
    Card {
        Row(modifier.padding(16.dp)) {
            HeroInfo(hero.name, hero.description, modifier.weight(1f))
            HeroImage(hero.imageHero, modifier)
        }
    }
}

@Composable
fun HeroList(heroes: List<Hero>, contentPadding: PaddingValues, modifier: Modifier = Modifier){
    LazyColumn(
        modifier.padding(start = 16.dp, end = 16.dp),
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(heroes){
            HeroCard(it, modifier)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroApp(){
    var heroes by remember { mutableStateOf(Datasource().loadHeroes()) }
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Superheroes",
                    )
                },
                modifier = Modifier
            )

        }

    ){
        it -> HeroList(heroes, it)
    }
}