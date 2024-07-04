package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.time_table

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.example.schoolapp.R
import com.example.schoolapp.core.util.Constants.emptyString
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimeTableCard(
    subjectName: String,
    startTime: String,
    endTime: String,
    onClick: () -> Unit,
){
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
                .size(LocalSpacing.current.extraLarge)
                .background(MaterialTheme.colorScheme.primaryContainer, MaterialTheme.shapes.medium)
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = subjectName.take(3).uppercase(Locale.ROOT),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            Column(modifier = Modifier
                .weight(6f)
                .padding(start = LocalSpacing.current.default),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(modifier = Modifier.padding(LocalSpacing.current.extraSmall)) {
                    Text(text = subjectName,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Row(modifier = Modifier,
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier
                        .size(LocalSpacing.current.medium)
                        .padding(LocalSpacing.current.extraSmall)) {
                        Icon(
                            painter = painterResource(id = R.drawable.time),
                            contentDescription = emptyString,
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Box(modifier = Modifier.padding(LocalSpacing.current.extraSmall)) {
                        Text(text = "$startTime - $endTime",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }

            Box(modifier = Modifier
                .weight(1f),
                contentAlignment = Alignment.Center
            ){
                Text(
                    modifier = Modifier
                        .border(
                            color = MaterialTheme.colorScheme.error,
                            width = LocalSpacing.current.borderStroke,
                            shape = MaterialTheme.shapes.small
                        )
                        .padding(LocalSpacing.current.small)
                        ,
                    text = "DEL",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.error
                )
            }

            Box(modifier = Modifier
                .weight(1f)
                .padding(
                    horizontal = LocalSpacing.current.small,
                    vertical = LocalSpacing.current.default,
                ),
                contentAlignment = Alignment.CenterEnd
            ){
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = emptyString,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}