package com.example.schoolapp.feature_app.ui.presentation.composables.parent.classes.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.classes.SchoolClassInfoScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.classes.ParentClassInfoContent

@Composable
fun ParentClassInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            SchoolClassInfoScreenTopBar(topBarTitleText = "Class",
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
           ParentClassInfoContent(
               image = R.drawable.school_class,
               classId = "Class_1_Love_2023/2024_12345",
               className = "Class_1_Love",
               numberOfBoys = "15",
               numberOfGirls = "15",
               totalNumberOfStudents = "30",
               academicYear = "2023/2024",
               students = "Anthony Abuah, etc",
               subjects = "Mathematics, etc"
           )
        }
    }
}