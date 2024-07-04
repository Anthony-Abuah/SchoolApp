package com.example.schoolapp.feature_app.ui.presentation.composables.admin.term

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun TermContent(
    navigateToTermInfoScreen: ()-> Unit
){
    val teachers = listOf(
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
        TeacherInfo(name = "First Term", email = "6th January, 2024", userName = "4th April, 2024", image = R.drawable.school_term ),
    )

    BasicScreenColumn {
        teachers.forEach { teacherInfo ->
            TermCard(
                image = teacherInfo.image,
                termName = teacherInfo.name,
                startDate = teacherInfo.email,
                endDate = teacherInfo.userName
            ) {
                navigateToTermInfoScreen()
            }
            Divider(
                color = MaterialTheme.colorScheme.onBackground,
                thickness = LocalSpacing.current.divider
            )
        }
    }
}