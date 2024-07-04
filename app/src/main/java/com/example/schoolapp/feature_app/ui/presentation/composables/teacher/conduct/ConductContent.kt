package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun ConductContent(
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
            ConductCard(
                image = teacherInfo.image,
                studentName = teacherInfo.name,
                conduct = teacherInfo.email,
                interests = teacherInfo.userName,
                onClick = navigateToTeacherInfoScreen
            )
            Divider(
                color = MaterialTheme.colorScheme.onBackground,
                thickness = LocalSpacing.current.divider
            )
        }
    }
}