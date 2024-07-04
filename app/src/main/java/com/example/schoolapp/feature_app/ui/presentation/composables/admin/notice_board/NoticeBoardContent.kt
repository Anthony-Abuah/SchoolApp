package com.example.schoolapp.feature_app.ui.presentation.composables.admin.notice_board

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun NoticeBoardContent(
    navigateToNoticeBoardInfoScreen: ()-> Unit
){
    val teachers = listOf(
        TeacherInfo(name = "School Fees", email = "Very Important", userName = "NoticeBoard_English_Language_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "PTA Meeting", email = "Very Important", userName = "NoticeBoard_Mathematics_12345", image = R.drawable.parent ),
   )

    BasicScreenColumn {
        teachers.forEach { teacherInfo ->
            NoticeBoardCard(
                image = teacherInfo.image,
                title = teacherInfo.name,
                priority = teacherInfo.email,
                time = "24/01/2022, 12:30 PM",
                onClick = navigateToNoticeBoardInfoScreen
            )
            Divider(
                color = MaterialTheme.colorScheme.onBackground,
                thickness = LocalSpacing.current.divider
            )
        }
    }
}