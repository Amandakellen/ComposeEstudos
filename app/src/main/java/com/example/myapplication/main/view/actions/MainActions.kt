package com.example.myapplication.main.view.actions

interface MainActions {
    fun sendAction(action: Action)

    sealed class Action {
        object ClickButton : Action()
    }
}