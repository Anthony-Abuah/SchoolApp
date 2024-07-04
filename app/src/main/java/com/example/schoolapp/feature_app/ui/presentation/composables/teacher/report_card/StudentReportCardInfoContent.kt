package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.report_card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.schoolapp.core.util.Constants.emptyString
import com.example.schoolapp.feature_app.domain.model.SubjectScores
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.presentation.composables.components.WindowInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.rememberWindowInfo
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun StudentReportCardInfoContent(
    image: Int,
    studentName: String,
    email: String,
    studentId: String,
    schoolName: String,
    termName: String,
    className: String,
    vacationDate: String,
    reopeningDate: String,
){
    val subjectScores = listOf<SubjectScores>(
        SubjectScores(subjectName = "English Language", classScore = 40.5, examScore = 45.5, grade = "A", position = "24th", remarks = "Exellent"),
        SubjectScores(subjectName = "Mathematics", classScore = 30.5, examScore = 45.5, grade = "A", position = "3rd", remarks = "Exellent"),
        SubjectScores(subjectName = "Integrated Science", classScore = 45.5, examScore = 46.0, grade = "A", position = "24th", remarks = "Exellent"),
        SubjectScores(subjectName = "O.W.O.P", classScore = 40.5, examScore = 50.0, grade = "A", position = "1st", remarks = "Exellent"),
        SubjectScores(subjectName = "Creative Arts", classScore = 25.5, examScore = 36.5, grade = "A", position = "24th", remarks = "Exellent"),
        SubjectScores(subjectName = "I.C.T", classScore = 32.5, examScore = 48.5, grade = "A", position = "16th", remarks = "Exellent"),
        SubjectScores(subjectName = "Social Studies", classScore = 40.5, examScore = 35.0, grade = "A", position = "24th", remarks = "Exellent"),
        SubjectScores(subjectName = "B.D.T", classScore = 42.5, examScore = 32.5, grade = "A", position = "12th", remarks = "Exellent"),
        SubjectScores(subjectName = "P.E", classScore = 47.5, examScore = 38.5, grade = "A", position = "17th", remarks = "Exellent"),
        SubjectScores(subjectName = "Chemistry", classScore = 48.5, examScore = 42.5, grade = "A", position = "2nd", remarks = "Exellent"),
        SubjectScores(subjectName = "Biology", classScore = 39.5, examScore = 47.5, grade = "A", position = "9th", remarks = "Exellent"),
    )
    BasicScreenColumn {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Box(
                modifier = Modifier
                    .size(125.dp)
                    .padding(LocalSpacing.current.small)
                    .background(MaterialTheme.colorScheme.surface, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(painter = painterResource(id = image), contentDescription = emptyString)
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = studentName,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Id: $studentId",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Normal
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Email: $email",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primary,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Normal
                )
            }
        }
        val windowInfo = rememberWindowInfo()
        if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact){
            Box(modifier = Modifier
                .padding(LocalSpacing.current.small)
                .fillMaxWidth()
                .wrapContentHeight(),
                contentAlignment = Alignment.Center
            ){
                ReportCardForCompactScreen(
                    studentName = studentName,
                    schoolName = schoolName,
                    termName = termName,
                    className = className,
                    vacationDate = vacationDate,
                    reopeningDate = reopeningDate,
                    classTeacherRemarks = "This student has more room for improvement. He needs to study harder and stop playing in class while classes are ongoing.",
                    headTeacherRemarks = "More room for improvement",
                    conduct =  "Very Attentive and hardworking in class",
                    interest = "Reading and playing chess",
                    attendanceDays = 56.toString(),
                    schoolDays = 57.toString(),
                    rawScore = 876.85,
                    totalRawScore = 1100.00,
                    averageScore = 79.47,
                    classAverageScore = 73.47,
                    classPosition = "3RD",
                    numberOfStudents = 25,
                    subjectScores = subjectScores
                )
            }
        }
        else{
            Box(modifier = Modifier
                .padding(LocalSpacing.current.small)
                .fillMaxWidth()
                .wrapContentHeight(),
                contentAlignment = Alignment.Center
            ) {
                ReportCardForNonCompactScreen(
                    studentName = studentName,
                    schoolName = schoolName,
                    termName = termName,
                    className = className,
                    vacationDate = vacationDate,
                    reopeningDate = reopeningDate,
                    classTeacherRemarks = "This student has more room for improvement. He needs to study harder and stop playing in class while classes are ongoing.",
                    headTeacherRemarks = "More room for improvement",
                    conduct =  "Very Attentive and hardworking in class",
                    interest = "Reading and playing chess",
                    attendanceDays = 56.toString(),
                    schoolDays = 57.toString(),
                    rawScore = 876.85,
                    totalRawScore = 1100.00,
                    averageScore = 79.47,
                    classAverageScore = 73.47,
                    classPosition = "3RD",
                    numberOfStudents = 25,
                    subjectScores = subjectScores
                )
            }
        }



    }
}

