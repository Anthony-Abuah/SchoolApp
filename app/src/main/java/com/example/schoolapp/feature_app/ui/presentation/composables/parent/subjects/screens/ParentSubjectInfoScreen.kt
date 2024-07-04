package com.example.schoolapp.feature_app.ui.presentation.composables.parent.subjects.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.subject.SubjectInfoScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.subjects.ParentSubjectInfoContent

@Composable
fun ParentSubjectInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            SubjectInfoScreenTopBar(topBarTitleText = "Subjects",
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
            ParentSubjectInfoContent(
                image = R.drawable.subject,
                subjectId = "Subject_Mathematics_12345",
                subjectName = "Mathematics",
                classes = "All classes",
                teachers = "All teachers"
            )
        }
    }
}