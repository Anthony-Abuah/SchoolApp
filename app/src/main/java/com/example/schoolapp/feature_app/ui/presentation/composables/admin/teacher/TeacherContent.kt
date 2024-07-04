package com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun TeacherContent(
    navigateToTeacherInfoScreen: ()-> Unit
){
    val teachers = listOf(
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
    )

    BasicScreenColumn {
        teachers.forEach { teacherInfo ->
            TeacherCard(
                image = teacherInfo.image,
                teacherName = teacherInfo.name,
                email = teacherInfo.email,
                teacherId = teacherInfo.userName,
                onClick = navigateToTeacherInfoScreen
            )
            Divider(
                color = MaterialTheme.colorScheme.onBackground,
                thickness = LocalSpacing.current.divider
            )
        }
    }
}