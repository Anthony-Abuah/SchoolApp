package com.example.schoolapp.feature_app.ui.presentation.composables.parent.wards.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.wards.ParentWardContent
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.GradingSubjectScreenTopBar

@Composable
fun ParentWardScreen(
    navigateToGradingSubjectScreen: () -> Unit,
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            GradingSubjectScreenTopBar(topBarTitleText = "Students",
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
            ParentWardContent {
                navigateToGradingSubjectScreen()
            }
        }
    }
}