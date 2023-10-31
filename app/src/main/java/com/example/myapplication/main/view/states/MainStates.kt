package com.example.myapplication.main.view.states

sealed class MainStates{
    data class Enabled(val isEnabled: Boolean) : MainStates()
    data class Disabled(val isEnabled: Boolean) : MainStates()
}
