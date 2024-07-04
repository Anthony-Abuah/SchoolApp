package com.example.schoolapp.feature_app.ui.presentation.composables.admin.classes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import com.example.schoolapp.core.util.Constants.emptyString
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SchoolClassCard(
    image: Int,
    className: String,
    totalStudents: String,
    academicYear: String,
    teachers: String,
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
                .background(MaterialTheme.colorScheme.surface, CircleShape)
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ){
                Image(
                    modifier = Modifier.size(LocalSpacing.current.iconHeight),
                    painter = painterResource(id = image),
                    contentDescription = emptyString)
            }
            Column(modifier = Modifier.weight(1f)
                .padding(start = LocalSpacing.current.default),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(modifier = Modifier.padding(LocalSpacing.current.extraSmall)) {
                    Text(text = className,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Box(modifier = Modifier.padding(LocalSpacing.current.extraSmall)) {
                    Text(text = "No. on Roll: $totalStudents",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.primary,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
                Box(modifier = Modifier.padding(LocalSpacing.current.extraSmall)) {
                    Text(text = "Academic Year: $academicYear",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.error,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
                Box(modifier = Modifier.padding(LocalSpacing.current.extraSmall)) {
                    Text(text = "Teachers: $teachers",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }
    }
}