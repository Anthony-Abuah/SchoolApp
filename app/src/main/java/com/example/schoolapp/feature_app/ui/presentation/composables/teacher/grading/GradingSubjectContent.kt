package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun GradingSubjectContent(
    studentName: String,
    navigateToGradingScoreInfoScreen: ()-> Unit
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

    Column(modifier = Modifier.fillMaxSize()
        .background(MaterialTheme.colorScheme.background)
    ) {

        Divider(
            modifier = Modifier.padding(bottom = LocalSpacing.current.small),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = 0.25.dp
        )

        Box(
            modifier = Modifier
                .padding(LocalSpacing.current.default)
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                //modifier = Modifier.padding(LocalSpacing.current.small),
                text = "Student: $studentName",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold
            )
        }

        Divider(
            modifier = Modifier.padding(top = LocalSpacing.current.small),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = 0.25.dp
        )

        Box(modifier = Modifier.fillMaxSize(1f)
        ) {
            BasicScreenColumn {
                teachers.forEach { teacherInfo ->
                    GradingSubjectCard(
                        image = R.drawable.grade,
                        studentName = teacherInfo.name,
                        subjectName = "Mathematics",
                        finalScore = "80.0%",
                        grade = "A",
                        gradeRemarks = "Excellent"
                    ) {
                        navigateToGradingScoreInfoScreen()
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