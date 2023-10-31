package com.example.myapplication.main.view.effects

sealed class MainEffects {
    object NextScreen : MainEffects()
    data class NavigateToScreen(val screen: String) : MainEffects()
}