package com.example.flashcards.designpatterns

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flashcards.designpatterns.model.DesignPattern
import com.example.flashcards.designpatterns.model.DesignPatternsRepository
import com.example.flashcards.designpatterns.model.PatternType
import com.example.flashcards.designpatterns.ui.theme.DesignPatternFlashcardsTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DesignPatternList(
    designPatterns: List<DesignPattern>,
    modifier: Modifier = Modifier
) {
    val state =  rememberLazyListState()
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        state = state,
        flingBehavior = rememberSnapFlingBehavior(lazyListState = state)
    ) {
        items(designPatterns) { designPattern ->
            DesignPatternListItem(designPattern = designPattern)
        }
    }
}

@Composable
fun DesignPatternListItem(
    designPattern: DesignPattern,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxHeight()
            .width(LocalConfiguration.current.screenWidthDp.dp),
        colors = CardDefaults.cardColors(
            containerColor = when (designPattern.type) {
                PatternType.CREATIONAL -> Color(0xFFFAD5D5)
                PatternType.STRUCTURAL -> Color(0xFFD4FFB1)
                PatternType.BEHAVIORAL -> Color(0xFFC0D5FF)
            }
        )
    ) {
        Column() {
            Text(
                text = stringResource(id = designPattern.name),
                fontSize = 30.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(text = stringResource(id = designPattern.description))
            Text(text = stringResource(id = designPattern.url))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DesignPatternListPreview() {
    DesignPatternFlashcardsTheme {
        DesignPatternList(DesignPatternsRepository.designPatterns)
    }
}

@Preview
@Composable
fun DesignPatternListItemPreview() {
    DesignPatternFlashcardsTheme {
        DesignPatternListItem(designPattern = DesignPatternsRepository.designPatterns[0])
    }
}