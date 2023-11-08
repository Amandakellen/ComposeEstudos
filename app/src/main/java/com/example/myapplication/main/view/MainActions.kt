package com.example.myapplication.main.view

interface MainActions {
    fun sendAction(action: Action)

    sealed class Action {
        object ClickButton : Action()
    }
}