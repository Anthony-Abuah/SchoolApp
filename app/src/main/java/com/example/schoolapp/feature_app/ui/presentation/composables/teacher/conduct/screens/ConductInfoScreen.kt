package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct.ConductInfoContent

@Composable
fun ConductInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            BasicScreenTopBar(topBarTitleText = "Conducts",
            ) {
                navigateBack()
            }
        },
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            ConductInfoContent(
                image = R.drawable.student_conduct,
                studentId = "Student_Anthony_Abuah_12345",
                email = "abuahdanyameanthony@gmail.com",
                studentFullName = "Anthony Danyame Abuah",
                className = "Class 1 Love",
                termName = "First Term 2023/2024",
                conduct = "Very respectful and studious student. Has more room for improvement",
                interest = "Chess, Football, Table tennis, critical thinking"
            )
        }
    }
}