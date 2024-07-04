package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.time_table.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.time_table.TimeTableContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.time_table.TimeTableScreenTopBar

@Composable
fun TimeTableScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            TimeTableScreenTopBar(topBarTitleText = "Time Tables",
                onClickAdd = {}
            ) {
                navigateBack()
            }
        },
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            TimeTableContent(
                className = "Class 1 Love",
                termName = "First Term, 2023/2024"
            )
        }
    }
}