package com.example.schoolapp.feature_app.ui.presentation.composables.admin.classes.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.classes.SchoolClassContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.classes.SchoolClassScreenTopBar

@Composable
fun SchoolClassScreen(
    navigateBack: () -> Unit,
    navigateToClassInfoScreen: () -> Unit,
){
    Scaffold(
        topBar = {
            SchoolClassScreenTopBar(topBarTitleText = "Classes",
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
            SchoolClassContent(navigateToClassInfoScreen)
        }
    }
}