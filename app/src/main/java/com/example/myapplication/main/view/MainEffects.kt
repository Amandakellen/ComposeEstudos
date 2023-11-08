package com.example.myapplication.main.view

sealed class MainEffects {
    object NextScreen : MainEffects()
    data class NavigateToScreen(val screen: String) : MainEffects()
}