package com.example.myapplication

interface MainActions {
    fun sendAction(action: Action)

    sealed class Action {
        object ClickButton : Action()
    }
}