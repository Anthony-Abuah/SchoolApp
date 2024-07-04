package com.example.schoolapp.core.util

sealed class UIEvent{
        data class ShowSnackBar(val message: String): UIEvent()
    }