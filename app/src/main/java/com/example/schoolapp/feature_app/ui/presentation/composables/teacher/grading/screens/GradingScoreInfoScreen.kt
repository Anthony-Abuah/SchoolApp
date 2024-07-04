package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct.ConductInfoContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.GradingScoreInfoContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.GradingScoreInfoScreenTopBar

@Composable
fun GradingScoreInfoScreen(
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
            GradingScoreInfoContent(
                image = R.drawable.grade,
                studentName = "Anthony Abuah",
                termName = "First Term 2023/2024",
                subjectName = "Mathematics",
                scores = listOf("80.00", "80.00", "80.00", "80.00", "80.00", "80.00")
            )
        }
    }
}