package com.example.schoolapp.feature_app.ui.presentation.composables.admin.parent

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun ParentContent(
    navigateToParentInfoScreen: ()-> Unit
){
    val teachers = listOf(
        TeacherInfo(name = "Ophelia Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_English_Language_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
        TeacherInfo(name = "Anthony Abuah", email = "abuahdanyameanthony@gmail.com", userName = "Parent_Mathematics_12345", image = R.drawable.parent ),
   )

    BasicScreenColumn {
        teachers.forEach { teacherInfo ->
            ParentCard(
                image = teacherInfo.image,
                parentName = teacherInfo.name,
                email = teacherInfo.email,
                contact = "+233 500912348",
                onClick = navigateToParentInfoScreen
            )
            Divider(
                color = MaterialTheme.colorScheme.onBackground,
                thickness = LocalSpacing.current.divider
            )
        }
    }
}