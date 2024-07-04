package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.exam_time_table.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.core.util.DaysOfTheWeek
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.exam_time_table.ExamTimeTableContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.time_table.TimeTableScreenTopBar

@Composable
fun ExamTimeTableScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            TimeTableScreenTopBar(topBarTitleText = "Exam Time Tables",
                onClickAdd = {}
            ) {
                navigateBack()
            }
        },
    ){         it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            ExamTimeTableContent(
                examDays = DaysOfTheWeek.values().map { day -> day.fullName },
                examType = "End Of Term Exams",
                termName = "First Term, 2023/2024"
            )
        }
    }
}