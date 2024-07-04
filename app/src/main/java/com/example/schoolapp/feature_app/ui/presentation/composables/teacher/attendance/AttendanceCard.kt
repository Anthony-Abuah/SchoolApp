package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.attendance

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.example.schoolapp.R
import com.example.schoolapp.core.util.Constants.Absent
import com.example.schoolapp.core.util.Constants.Present
import com.example.schoolapp.core.util.Constants.emptyString
import com.example.schoolapp.core.util.Functions.isPresentColor
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AttendanceCard(
    studentName: String,
    studentId: String,
    getPresentValue: (isPresent: Boolean) -> Unit,
    onClick: () -> Unit,
){
    var isPresent by remember {
        mutableStateOf(false)
    }
    Card(
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(
            contentColor = MaterialTheme.colorScheme.onBackground,
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
        onClick = { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = LocalSpacing.current.noElevation)
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Box(modifier = Modifier
                .size(LocalSpacing.current.topAppBarSize)
                .background(MaterialTheme.colorScheme.primaryContainer, MaterialTheme.shapes.medium)
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = studentName.take(1).uppercase(Locale.ROOT),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            Column(modifier = Modifier
                .weight(5f)
                .padding(start = LocalSpacing.current.default),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(modifier = Modifier.padding(LocalSpacing.current.extraSmall)) {
                    Text(text = studentName,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Box(modifier = Modifier.padding(LocalSpacing.current.extraSmall)) {
                    Text(text = studentId,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            Row(modifier = Modifier
                .wrapContentSize()
                .clickable {
                    isPresent = !isPresent
                    getPresentValue(isPresent)
                }
                .border(
                    color = if (isPresent) isPresentColor(isSystemInDarkTheme()) else  MaterialTheme.colorScheme.error,
                    width = LocalSpacing.current.borderStroke,
                    shape = MaterialTheme.shapes.medium
                ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(modifier = Modifier,
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        modifier = Modifier.padding(LocalSpacing.current.small),
                        text = if (isPresent) Present else Absent,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.SemiBold,
                        color = if (isPresent) isPresentColor(isSystemInDarkTheme()) else  MaterialTheme.colorScheme.error
                    )
                }

                Box(modifier = Modifier
                    .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterEnd
                ){
                    Icon(
                        painter = painterResource(id = if (isPresent) R.drawable.checked_circle else R.drawable.cancel_circle),
                        contentDescription = emptyString,
                        tint = if (isPresent) isPresentColor(isSystemInDarkTheme()) else  MaterialTheme.colorScheme.error
                    )
                }
            }


        }
    }
}