package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.attendance.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.attendance.AttendanceContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.time_table.TimeTableScreenTopBar
import java.time.LocalDate

@Composable
fun AttendanceScreen(
    navigateBack: () -> Unit,
){
    val startDate = LocalDate.now().minusDays(7)
    val endDate = LocalDate.now().plusDays(7)
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
            AttendanceContent(
                startDate = startDate,
                endDate = endDate,
                className = "Class 1 Love",
                termName = "First Term, 2023/2024")
        }
    }
}