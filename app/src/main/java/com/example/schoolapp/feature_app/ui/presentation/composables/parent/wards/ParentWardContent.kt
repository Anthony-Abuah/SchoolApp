package com.example.schoolapp.feature_app.ui.presentation.composables.parent.wards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun ParentWardContent(
    navigateToParentWardInfoScreen: () -> Unit
){
    val teachers = listOf(
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Student_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Student_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        )

    Column(modifier = Modifier.fillMaxSize()
        .background(MaterialTheme.colorScheme.background)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(1f)
        ) {
            BasicScreenColumn {
                teachers.forEach { teacherInfo ->
                    ParentWardCard(
                        image = R.drawable.student,
                        studentName = teacherInfo.name,
                        className = "Class 1 Love",
                        studentId = teacherInfo.userName
                    ) {
                        navigateToParentWardInfoScreen()
                    }
                    Divider(
                        color = MaterialTheme.colorScheme.onBackground,
                        thickness = LocalSpacing.current.divider
                    )
                }
            }
        }
    }
}