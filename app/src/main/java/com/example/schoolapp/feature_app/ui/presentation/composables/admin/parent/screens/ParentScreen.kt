package com.example.schoolapp.feature_app.ui.presentation.composables.admin.parent.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.parent.ParentContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.parent.ParentScreenTopBar

@Composable
fun ParentScreen(
    navigateBack: () -> Unit,
    navigateToParentInfoScreen: () -> Unit,
){
    Scaffold(
        topBar = {
            ParentScreenTopBar(topBarTitleText = "Parents",
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
            ParentContent(navigateToParentInfoScreen)
        }
    }
}