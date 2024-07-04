package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.report_card.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.GradingScoreInfoScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.report_card.StudentReportCardInfoContent

@Composable
fun StudentReportCardInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            GradingScoreInfoScreenTopBar(topBarTitleText = "Grading",
                onAddScore = {}
            ) {
                navigateBack()
            }
        },
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            StudentReportCardInfoContent(
                image = R.drawable.student,
                studentName = "Anthony Danyame Abuah",
                email = "abuahdanyameanthony@gmail.com",
                studentId = "Student_Anthony_Abuah_12345",
                schoolName = "Woodbridge International School",
                termName = "First Term 2023/ 2024",
                className = "Class 1 Love",
                vacationDate = "4th April, 2024",
                reopeningDate = "13th May, 2024"
            )
        }
    }
}