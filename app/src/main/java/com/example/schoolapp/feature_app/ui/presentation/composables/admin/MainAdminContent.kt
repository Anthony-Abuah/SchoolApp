package com.example.schoolapp.feature_app.ui.presentation.composables.admin

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.schoolapp.R
import com.example.schoolapp.core.util.Constants.admins
import com.example.schoolapp.core.util.Constants.notice_boards
import com.example.schoolapp.core.util.Constants.parents
import com.example.schoolapp.core.util.Constants.schoolClasses
import com.example.schoolapp.core.util.Constants.schoolTeachers
import com.example.schoolapp.core.util.Constants.school_Terms
import com.example.schoolapp.core.util.Constants.subjects
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun MainAdminContent(
    onOpenTeachers: ()-> Unit,
    onOpenParents: ()-> Unit,
    onOpenSubjects: ()-> Unit,
    onOpenClasses: ()-> Unit,
    onOpenTerms: ()-> Unit,
    onOpenNoticeBoards: ()-> Unit,
    onOpenAdmins: ()-> Unit,

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
                .clickable { onOpenTeachers() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.school_teacher, label = schoolTeachers, onClick = onOpenTeachers)
            }

            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenParents() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.parent, label = parents, onClick = onOpenParents)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenSubjects() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.subject, label = subjects, onClick = onOpenSubjects)
            }
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenClasses() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.school_class, label = schoolClasses, onClick = onOpenClasses)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenTerms() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.school_term, label = school_Terms, onClick = onOpenTerms)
            }
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenNoticeBoards() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.notice_board, label = notice_boards, onClick = onOpenNoticeBoards)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f)
                .clickable { onOpenAdmins() },
                contentAlignment = Alignment.Center
            ) {
                IconCard(image = R.drawable.school_admin, label = admins, onClick = onOpenAdmins)
            }

        }


    }
}