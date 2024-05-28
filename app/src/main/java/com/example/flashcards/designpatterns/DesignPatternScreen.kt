package com.example.flashcards.designpatterns

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flashcards.designpatterns.model.DesignPattern
import com.example.flashcards.designpatterns.model.DesignPatternsRepository
import com.example.flashcards.designpatterns.model.PatternType
import com.example.flashcards.designpatterns.ui.theme.DesignPatternFlashcardsTheme

@Composable
fun DesignPatternList(
    designPatterns: List<DesignPattern>,
    modifier: Modifier = Modifier
) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {
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
        modifier = modifier.fillMaxWidth(),
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