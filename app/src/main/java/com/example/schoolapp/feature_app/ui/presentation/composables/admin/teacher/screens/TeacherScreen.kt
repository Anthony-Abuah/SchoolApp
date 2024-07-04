package com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.TeacherContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.TeacherScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar

@Composable
fun TeacherScreen(
    navigateBack: () -> Unit,
    navigateToTeacherInfoScreen: () -> Unit,
){
    Scaffold(
        topBar = {
            TeacherScreenTopBar(topBarTitleText = "Teachers",
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
            TeacherContent(navigateToTeacherInfoScreen)
        }
    }
}