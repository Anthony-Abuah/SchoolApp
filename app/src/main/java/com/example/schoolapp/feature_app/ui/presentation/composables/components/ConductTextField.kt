package com.example.schoolapp.feature_app.ui.presentation.composables.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing


@Composable
fun ConductTextField(
    height: Dp,
    conduct: String,
    readOnlyState: Boolean,
    getValue: (value: String) -> Unit
) {

    var value by remember {
        mutableStateOf(conduct)
    }

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .padding(horizontal = LocalSpacing.current.small)
            .border(
                width = LocalSpacing.current.extraSmall,
                color = MaterialTheme.colorScheme.primary,
                shape = MaterialTheme.shapes.medium
            ),
        readOnly = readOnlyState,
        value = value,
        onValueChange = { newValue ->
            value = newValue
            getValue(value)
        },

        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.background,
            unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant,
            disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant,
            focusedTextColor = MaterialTheme.colorScheme.onBackground,
            unfocusedTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
            disabledTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
        ),
        singleLine = false,
        minLines = 3,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done
        ),
        textStyle = MaterialTheme.typography.bodyMedium,
        shape = MaterialTheme.shapes.medium
    )
}


@Composable
fun ReportConductTextField(
    height: Dp,
    conduct: String,
    readOnlyState: Boolean,
    getValue: (value: String) -> Unit
) {

    var value by remember {
        mutableStateOf(conduct)
    }

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .padding(horizontal = LocalSpacing.current.noPadding)
            .border(
                width = LocalSpacing.current.borderStroke,
                color = MaterialTheme.colorScheme.onSurface,
                shape = MaterialTheme.shapes.medium
            ),
        readOnly = readOnlyState,
        value = value,
        onValueChange = { newValue ->
            value = newValue
            getValue(value)
        },

        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.background,
            unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant,
            disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant,
            focusedTextColor = MaterialTheme.colorScheme.onBackground,
            unfocusedTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
            disabledTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
        ),
        singleLine = false,
        minLines = 3,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done
        ),
        textStyle = MaterialTheme.typography.bodyMedium,
        shape = MaterialTheme.shapes.medium
    )
}
