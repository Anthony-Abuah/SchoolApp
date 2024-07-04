package com.example.schoolapp.feature_app.ui.presentation.composables.teacher

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.core.util.Constants.EditProfile
import com.example.schoolapp.core.util.Constants.attendance
import com.example.schoolapp.core.util.Constants.conducts
import com.example.schoolapp.core.util.Constants.exam_time_Tables
import com.example.schoolapp.core.util.Constants.grades
import com.example.schoolapp.core.util.Constants.report
import com.example.schoolapp.core.util.Constants.time_Tables
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.IconCard
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun TeacherDashboardContent(
    onOpenTimeTables: ()-> Unit,
    onOpenExamTimeTables: ()-> Unit,
    onOpenAttendances: ()-> Unit,
    onOpenConducts: ()-> Unit,
    onOpenGrades: ()-> Unit,
    onOpenReport: ()-> Unit,
    onOpenProfile: ()-> Unit,

    ){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.surface),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenTimeTables() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.time_table, label = time_Tables, onClick = onOpenTimeTables)
            }

            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenExamTimeTables() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.time_table, label = exam_time_Tables, onClick = onOpenExamTimeTables)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenAttendances() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.attendance, label = attendance, onClick = onOpenAttendances)
            }
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenConducts() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.student_conduct, label = conducts, onClick = onOpenConducts)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenGrades() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.grade, label = grades, onClick = onOpenGrades)
            }
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenReport() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.report_card, label = report, onClick = onOpenReport)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenProfile() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.school_teacher, label = EditProfile, onClick = onOpenProfile)
            }

        }
    }
}