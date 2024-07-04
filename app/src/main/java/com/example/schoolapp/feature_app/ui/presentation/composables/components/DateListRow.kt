package com.example.schoolapp.feature_app.ui.presentation.composables.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import java.time.LocalDate

@Composable
fun DateListRow(
    dates: List<LocalDate>
) {
    var selectedDate by remember {
        mutableStateOf( if (dates.contains(LocalDate.now())) LocalDate.now() else if(dates.isNotEmpty())dates.first() else LocalDate.now())
    }

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState(initial = 0))
        ) {
            dates.forEach { date ->
                Box(modifier = Modifier,
                contentAlignment = Alignment.Center) {
                    DateDayChip(selectedDate = selectedDate,
                        dateListDate = date,
                        getToggledValue = {_selectedDate->
                            selectedDate = _selectedDate
                        }
                    )
                }
            }
        }
    }
}



