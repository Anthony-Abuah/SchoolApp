package com.example.schoolapp.feature_app.ui.presentation.composables.parent

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.core.util.Constants.EditProfile
import com.example.schoolapp.core.util.Constants.notice_boards
import com.example.schoolapp.core.util.Constants.schoolClasses
import com.example.schoolapp.core.util.Constants.schoolTeachers
import com.example.schoolapp.core.util.Constants.school_Terms
import com.example.schoolapp.core.util.Constants.subjects
import com.example.schoolapp.core.util.Constants.wards
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.IconCard
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun ParentDashboardContent(
    onOpenNoticeBoard: ()-> Unit,
    onOpenWards: ()-> Unit,
    onOpenTeachers: ()-> Unit,
    onOpenSubjects: ()-> Unit,
    onOpenParentClassScreen: ()-> Unit,
    onOpenParentTerm: ()-> Unit,
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
                .clickable { onOpenWards() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.student, label = wards, onClick = onOpenWards)
            }

            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenNoticeBoard() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.notice_board, label = notice_boards, onClick = onOpenNoticeBoard)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenTeachers() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.school_teacher, label = schoolTeachers, onClick = onOpenTeachers)
            }
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenSubjects() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.subject, label = subjects, onClick = onOpenSubjects)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenParentClassScreen() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.school_class, label = schoolClasses, onClick = onOpenParentClassScreen)
            }
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenParentTerm() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.school_term, label = school_Terms, onClick = onOpenParentTerm)
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