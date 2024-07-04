package com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.domain.model.TeacherInfo
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun AdministratorContent(
    navigateToAdministratorInfoScreen: ()-> Unit
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

    BasicScreenColumn {
        teachers.forEach { teacherInfo ->
            AdministratorCard(
                image = teacherInfo.image,
                adminName = teacherInfo.name,
                email = teacherInfo.email,
                contact = "+233 500912348",
                onClick = navigateToAdministratorInfoScreen
            )
            Divider(
                color = MaterialTheme.colorScheme.onBackground,
                thickness = LocalSpacing.current.divider
            )
        }
    }
}