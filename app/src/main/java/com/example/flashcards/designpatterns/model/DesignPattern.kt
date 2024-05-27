package com.example.flashcards.designpatterns.model

import androidx.annotation.StringRes

data class DesignPattern(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @StringRes val url: Int,
    val type: PatternType
)

enum class PatternType {
    CREATIONAL,
    STRUCTURAL,
    BEHAVIORAL
}