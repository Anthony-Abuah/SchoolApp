package com.example.schoolapp.feature_app.ui.presentation.composables.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.schoolapp.core.util.Constants
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun ClassTermHeader(
    className: String,
    termName: String,
){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier
            .weight(1f)
            .padding(LocalSpacing.current.noPadding),
            contentAlignment = Alignment.CenterStart
        ){
            Icon(
                modifier = Modifier.requiredSize(LocalSpacing.current.large),
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = Constants.emptyString,
                tint = MaterialTheme.colorScheme.onSurface)
        }
        Box(modifier = Modifier
            .weight(6f)
            .padding(top = LocalSpacing.current.small),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "$className - $termName",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        Box(modifier = Modifier
            .weight(1f)
            .padding(LocalSpacing.current.noPadding),
            contentAlignment = Alignment.CenterEnd
        ){
            Icon(
                modifier = Modifier.requiredSize(LocalSpacing.current.large),
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = Constants.emptyString,
                tint = MaterialTheme.colorScheme.onSurface)
        }
    }
}