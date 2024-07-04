package com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.TeacherInfoContent
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.TeacherInfoScreenTopBar
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar

@Composable
fun TeacherInfoScreen(
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            TeacherInfoScreenTopBar(topBarTitleText = "Teachers",
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
            TeacherInfoContent(
                image = R.drawable.school_teacher,
                teacherId = "Teacher_Phillip_Baidoo_32423",
                firstName = "Phillip",
                lastName = "Baidoo",
                otherNames = "Kraakye",
                contact = "+233 500912348",
                email = "phillipbaidoo@gmail.com",
                gender = "Male",
                classes = "Class 6 Love",
                subjects = "All subjects"
            )
        }
    }
}