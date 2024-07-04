package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct.ConductInfoContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.GradingScoreInfoContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.GradingScoreInfoScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.GradingSubjectContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.GradingSubjectScreenTopBar
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun GradingSubjectScreen(
    navigateToGradingScoreInfoScreen: () -> Unit,
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            GradingSubjectScreenTopBar(topBarTitleText = "Subjects",
                onClick = {}
            ) {
                navigateBack()
            }
        },
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            GradingSubjectContent(
                studentName = "Anthony Abuah"
            ) {
                navigateToGradingScoreInfoScreen()
            }
        }
    }
}