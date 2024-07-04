package com.example.schoolapp.feature_app.ui.presentation.composables.admin.term.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.term.TermInfoContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.term.TermInfoScreenTopBar

@Composable
fun TermInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            TermInfoScreenTopBar(topBarTitleText = "Terms",
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
            TermInfoContent(
                image = R.drawable.school_term,
                termId = "Term_Second_Term_2023/2024_23423",
                termName = "Second Term",
                academicYear = "2023/2024",
                startDate = "6th January, 2024",
                endDate = "4th April, 2024",
                numberOfDays = "54 days",
            )
        }
    }
}