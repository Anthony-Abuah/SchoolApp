package com.example.schoolapp.feature_app.ui.presentation.composables.admin.classes

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun SchoolClassContent(
    navigateToClassInfoScreen: ()-> Unit
){
    val teachers = listOf(
        TeacherInfo(name = "Class 1 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
        TeacherInfo(name = "Class 2 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
        TeacherInfo(name = "Class 3 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
        TeacherInfo(name = "Class 4 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
        TeacherInfo(name = "Class 5 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
        TeacherInfo(name = "Class 6 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
        TeacherInfo(name = "Class 7 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
        TeacherInfo(name = "Class 8 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
        TeacherInfo(name = "Class 9 Love", email = "30", userName = "2023/2024", image = R.drawable.school_class ),
    )

    BasicScreenColumn {
        teachers.forEach { teacherInfo ->
            SchoolClassCard(
                image = teacherInfo.image,
                className = teacherInfo.name,
                totalStudents = teacherInfo.email,
                academicYear = teacherInfo.userName,
                teachers = "Phillip Baidoo, etc"
            ) {
                navigateToClassInfoScreen()
            }
            Divider(
                color = MaterialTheme.colorScheme.onBackground,
                thickness = LocalSpacing.current.divider
            )
        }
    }
}