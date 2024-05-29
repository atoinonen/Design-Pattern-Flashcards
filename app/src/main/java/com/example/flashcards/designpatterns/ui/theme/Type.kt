package com.example.flashcards.designpatterns.ui.theme


import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.flashcards.designpatterns.R

val SourceCodePro = FontFamily(
    Font(R.font.source_code_pro_regular, FontWeight.W400),
    Font(R.font.source_code_pro_semi_bold, FontWeight.W600)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyMedium = TextStyle(
        fontFamily = SourceCodePro,
        fontWeight = FontWeight.W400,
        fontSize = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = SourceCodePro,
        fontWeight = FontWeight.W600,
        fontSize = 12.sp
    ),
    displayMedium = TextStyle(
        fontFamily = SourceCodePro,
        fontWeight = FontWeight.W600,
        fontSize = 36.sp
    )
)