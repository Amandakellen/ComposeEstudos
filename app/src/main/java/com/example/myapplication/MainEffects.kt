package com.example.myapplication

sealed class MainEffects {
    object NextScreen : MainEffects()
    data class NavigateToScreen(val screen: String) : MainEffects()
}