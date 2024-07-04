package com.example.schoolapp.feature_app.ui.presentation.composables.admin.term.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.term.TermContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.term.TermScreenTopBar

@Composable
fun TermScreen(
    navigateBack: () -> Unit,
    navigateToTermInfoScreen: () -> Unit,
){
    Scaffold(
        topBar = {
            TermScreenTopBar(topBarTitleText = "Terms",
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
            TermContent(navigateToTermInfoScreen)
        }
    }
}