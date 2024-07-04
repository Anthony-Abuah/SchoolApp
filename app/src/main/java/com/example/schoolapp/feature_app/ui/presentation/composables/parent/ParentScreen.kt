package com.example.schoolapp.feature_app.ui.presentation.composables.parent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.schoolapp.feature_app.ui.presentation.composables.bottom_nav.BottomBar
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar

@Composable
fun ParentScreen(
    navController: NavHostController,
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            BasicScreenTopBar(topBarTitleText = "Parent") {
                navigateBack()
            }
        },
        bottomBar = { BottomBar(navController) }
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            Text(text = "Parent Screen",
                style = MaterialTheme.typography.labelLarge
            )
        }
    }
}