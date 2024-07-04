package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.attendance

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.schoolapp.R
import com.example.schoolapp.core.util.Functions.createListOfDates
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.presentation.composables.components.DateListRow
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing
import java.time.LocalDate

@Composable
fun AttendanceContent(
    startDate: LocalDate,
    endDate: LocalDate,
    className: String,
    termName: String
){
    val teachers = listOf(
        TeacherInfo(name = "Ophelia Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_English_Language_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Administrator_Mathematics_12345", image = R.drawable.school_admin ),

        )
    val selectedDate by remember {
        mutableStateOf(LocalDate.now())
    }

    val listOfDates = createListOfDates(startDate, endDate)
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)
    ) {
        Box(modifier = Modifier.fillMaxWidth()
            .padding(LocalSpacing.current.default),
        contentAlignment = Alignment.Center
        ){
            Text(
                text = "$className - $termName",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        DateListRow(dates = listOfDates)
        BasicScreenColumn {
            teachers.forEach { teacherInfo ->
                AttendanceCard(
                    studentName = teacherInfo.name,
                    studentId = teacherInfo.userName,
                    getPresentValue = { it }
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