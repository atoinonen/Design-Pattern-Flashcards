package com.example.flashcards.designpatterns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flashcards.designpatterns.model.DesignPatternsRepository
import com.example.flashcards.designpatterns.ui.theme.DesignPatternFlashcardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignPatternFlashcardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Flashcards()
                }
            }
        }
    }
}

@Composable
fun Flashcards(modifier: Modifier = Modifier) {
    DesignPatternList(designPatterns = DesignPatternsRepository.designPatterns, modifier = modifier)
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    DesignPatternFlashcardsTheme {
        Flashcards()
    }
}