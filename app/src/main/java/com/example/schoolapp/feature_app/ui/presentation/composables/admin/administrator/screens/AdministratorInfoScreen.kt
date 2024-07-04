package com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator.AdministratorInfoContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator.AdministratorInfoScreenTopBar

@Composable
fun AdministratorInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            AdministratorInfoScreenTopBar(topBarTitleText = "Administrators",
                onDelete = {}
            ) {
                navigateBack()
            }
        },
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            AdministratorInfoContent(
                image = R.drawable.school_admin,
                administratorId = "Administrator_Ophelia_Abuah_32423",
                firstName = "Ophelia",
                lastName = "Abuah",
                contact = "+233 500912348",
                email = "opheliaabuah@gmail.com",
                gender = "Female",
                position = "Headmaster",
            )
        }
    }
}