package com.example.schoolapp.feature_app.ui.presentation.composables.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing
import java.util.*

@Composable
fun DayChip(
    selectedDay: String,
    timeTableDay: String,
    getToggledValue: (value: Boolean) -> Unit,
){
    val thisSelectedDay = selectedDay.lowercase(Locale.ROOT).take(3)
    val thisTimeTableDay = timeTableDay.lowercase(Locale.ROOT).take(3)
    val isSelected = thisSelectedDay == thisTimeTableDay
    val contentColor = MaterialTheme.colorScheme.onBackground
    val backgroundColor = MaterialTheme.colorScheme.background
    Column(
        modifier = Modifier
            .background(backgroundColor)
            .padding(vertical = LocalSpacing.current.smallMedium)
            .wrapContentSize()
            .toggleable(value = isSelected,
                onValueChange = { getToggledValue(it) }
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Divider(modifier = Modifier.padding(
            top = LocalSpacing.current.noPadding,
            bottom = LocalSpacing.current.default,
        ),
            color = contentColor,
            thickness = if (isSelected) 3.dp else 1.dp
        )
        Box(modifier = Modifier.padding(LocalSpacing.current.small),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = thisTimeTableDay.take(3)
                    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() },
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge,
                color = if (isSelected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.onSurface,
                fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.Normal
            )
        }
        Divider(modifier = Modifier.padding(
            top = if (isSelected) 4.dp else LocalSpacing.current.default
        ),
            color = contentColor,
            thickness = if (isSelected) 3.dp else 1.dp
        )
    }
}