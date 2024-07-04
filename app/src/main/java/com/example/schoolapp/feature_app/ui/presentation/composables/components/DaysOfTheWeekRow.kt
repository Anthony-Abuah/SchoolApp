package com.example.schoolapp.feature_app.ui.presentation.composables.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.schoolapp.core.util.DaysOfTheWeek
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing
import java.time.LocalDate
import java.util.*

@Composable
fun DaysOfTheWeekRow(
    days: List<String>
) {
    var selectedDay by remember {
        mutableStateOf( LocalDate.now().dayOfWeek.toString())
    }
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            days.forEach { day ->
                Box(modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center) {
                    DayChip(
                        selectedDay = selectedDay,
                        timeTableDay = day,
                        getToggledValue = { _isSelected ->
                            if (_isSelected) {
                                selectedDay = day
                            }
                        }
                    )
                }
            }
        }
    }
}