package com.example.schoolapp.feature_app.ui.presentation.composables.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing
import java.time.LocalDate
import java.util.*

@Composable
fun DateDayChip(
    selectedDate: LocalDate,
    dateListDate: LocalDate,
    getToggledValue: (value: LocalDate) -> Unit,
){
    val isSelected = selectedDate == dateListDate
    val backgroundColor = MaterialTheme.colorScheme.background
    val day = dateListDate.dayOfWeek.toString().take(3).replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
    val dayOfTheMonth = dateListDate.dayOfMonth
    val month = dateListDate.month.value
    val year = dateListDate.year.toString().takeLast(2)

    Column(
        modifier = Modifier
            .background(backgroundColor)
            .wrapContentSize()
            .toggleable(value = isSelected,
                onValueChange = {_isSelected->
                    if (_isSelected) {
                        getToggledValue(dateListDate)
                    }
                }
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(modifier = Modifier.requiredHeight(if (isSelected) 3.dp else 1.dp)
            .background(MaterialTheme.colorScheme.onBackground),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "long divider",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodySmall,
                color = if (isSelected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.onSurface,
                fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.Normal
            )
        }

        Column(
            modifier = Modifier.padding(vertical = if (isSelected) LocalSpacing.current.extraSmall else LocalSpacing.current.small),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            Box(modifier = Modifier.wrapContentSize()
                .padding( LocalSpacing.current.borderStroke),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = day,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge,
                    color = if (isSelected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.onSurface,
                    fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.Normal
                )
            }

            Box(modifier = Modifier.wrapContentSize()
            .padding( LocalSpacing.current.borderStroke),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "$dayOfTheMonth/$month/$year",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodySmall,
                    color = if (isSelected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.onSurface,
                    fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.Normal
                )
            }
        }
        Box(modifier = Modifier.requiredHeight(if (isSelected) 3.dp else 1.dp)
            .background(MaterialTheme.colorScheme.onBackground),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "long divider",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodySmall,
                color = if (isSelected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.onSurface,
                fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.Normal
            )
        }
    }
}