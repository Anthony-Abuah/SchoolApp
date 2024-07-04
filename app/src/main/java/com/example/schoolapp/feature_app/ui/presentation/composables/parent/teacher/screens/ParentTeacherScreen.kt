package com.example.schoolapp.feature_app.ui.presentation.composables.parent.teacher.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.TeacherScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.teacher.ParentTeacherContent

@Composable
fun ParentTeacherScreen(
    navigateToParentTeacherInfoScreen: () -> Unit,
    navigateBack: () -> Unit,
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
            ParentTeacherContent(navigateToParentTeacherInfoScreen)
        }
    }
}