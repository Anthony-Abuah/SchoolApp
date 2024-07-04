package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct.ConductContent

@Composable
fun ConductScreen(
    navigateToConductInfoScreen: () -> Unit,
    navigateBack: () -> Unit
){
    Scaffold(
        topBar = {
            BasicScreenTopBar(topBarTitleText = "Conduct",
            ) {
                navigateBack()
            }
        },
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            ConductContent(navigateToConductInfoScreen)
        }
    }
}