package com.example.schoolapp.feature_app.ui.presentation.composables.admin.subject.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.subject.SubjectContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.subject.SubjectScreenTopBar

@Composable
fun SubjectScreen(
    navigateBack: () -> Unit,
    navigateToSubjectInfoScreen: () -> Unit,
){
    Scaffold(
        topBar = {
            SubjectScreenTopBar(topBarTitleText = "Subjects",
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
            SubjectContent(navigateToSubjectInfoScreen)
        }
    }
}