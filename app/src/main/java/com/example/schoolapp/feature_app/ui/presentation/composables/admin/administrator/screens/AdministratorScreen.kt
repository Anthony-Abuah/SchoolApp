package com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator.AdministratorContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator.AdministratorScreenTopBar

@Composable
fun AdministratorScreen(
    navigateBack: () -> Unit,
    navigateToAdministratorInfoScreen: () -> Unit,
){
    Scaffold(
        topBar = {
            AdministratorScreenTopBar(topBarTitleText = "Administrators",
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
            AdministratorContent(navigateToAdministratorInfoScreen)
        }
    }
}