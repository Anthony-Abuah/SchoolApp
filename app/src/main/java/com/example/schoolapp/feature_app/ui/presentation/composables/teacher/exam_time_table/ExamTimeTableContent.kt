package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.exam_time_table

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.schoolapp.R
import com.example.schoolapp.core.util.DaysOfTheWeek
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.presentation.composables.components.ClassTermHeader
import com.example.schoolapp.feature_app.ui.presentation.composables.components.DaysOfTheWeekRow
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun ExamTimeTableContent(
    examDays: List<String>,
    examType: String,
    termName: String
){
    val teachers = listOf(
        TeacherInfo(name = "Mathematics", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "English", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Social Studies", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Physics", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "French", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Chemistry", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Biology", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Teacher_Anthony_Abuah_12345", image = R.drawable.school_teacher ),
    )
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)
    ) {
        ClassTermHeader(className = examType, termName = termName)

        DaysOfTheWeekRow(days = examDays)

        BasicScreenColumn {
            teachers.forEach { teacherInfo ->
                ExamTimeTableCardCard(subjectName = teacherInfo.name,
                    startTime = "8:00 AM",
                ) {

                }

                Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.default),
                    color = MaterialTheme.colorScheme.onBackground,
                    thickness = 0.5.dp
                )
            }
        }

    }

}