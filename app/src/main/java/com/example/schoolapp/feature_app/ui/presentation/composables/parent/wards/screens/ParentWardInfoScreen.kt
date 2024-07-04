package com.example.schoolapp.feature_app.ui.presentation.composables.parent.wards.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.TeacherInfoScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.wards.ParentWardInfoContent

@Composable
fun ParentWardInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            TeacherInfoScreenTopBar(topBarTitleText = "Ward",
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
            ParentWardInfoContent(
                image = R.drawable.student,
                studentId = "Student_Anthony_Abuah_12345",
                studentName = "Anthony Danyame Abuah",
                firstName = "Anthony",
                lastName = "Danyame",
                otherNames = "Abuah",
                email = "abuahdanyameanthony@gmail.com",
                gender = "Male",
                className = "Class 1 Love",
                teachers = "Phillip Baidoo, etc",
                parents = "Anthony S. Abuah, Ophelia Abuah",
                dateOfBirth = "02/01/1997"
            )
        }
    }
}