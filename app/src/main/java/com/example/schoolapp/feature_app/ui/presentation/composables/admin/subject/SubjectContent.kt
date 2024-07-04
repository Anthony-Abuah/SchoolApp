package com.example.schoolapp.feature_app.ui.presentation.composables.admin.subject

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun SubjectContent(
    navigateToSubjectInfoScreen: ()-> Unit
){
    val teachers = listOf(
        TeacherInfo(name = "English Language", email = "abuahdanyameanthony@gmail.com", userName = "Subject_English_Language_12345", image = R.drawable.subject ),
        TeacherInfo(name = "Mathematics", email = "abuahdanyameanthony@gmail.com", userName = "Subject_Mathematics_12345", image = R.drawable.subject ),
        TeacherInfo(name = "Social Studies", email = "abuahdanyameanthony@gmail.com", userName = "Subject_Social_Studies_12345", image = R.drawable.subject ),
        TeacherInfo(name = "Integrated Science", email = "abuahdanyameanthony@gmail.com", userName = "Subject_Integrated_Science_12345", image = R.drawable.subject ),
        TeacherInfo(name = "Physics", email = "abuahdanyameanthony@gmail.com", userName = "Subject_Physics_12345", image = R.drawable.subject ),
    )

    BasicScreenColumn {
        teachers.forEach { teacherInfo ->
            SubjectCard(
                image = teacherInfo.image,
                subjectName = teacherInfo.name,
                subjectId = teacherInfo.userName,
                onClick = navigateToSubjectInfoScreen
            )
            Divider(
                color = MaterialTheme.colorScheme.onBackground,
                thickness = LocalSpacing.current.divider
            )
        }
    }
}