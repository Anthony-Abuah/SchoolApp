package com.example.schoolapp.feature_app.ui.presentation.composables.parent.term

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.schoolapp.core.util.Constants.emptyString
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun ParentTermInfoContent(
    image: Int,
    termId: String,
    termName: String,
    academicYear: String,
    startDate: String,
    endDate: String,
    numberOfDays: String,
){

    BasicScreenColumn {
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Box(modifier = Modifier
                .size(125.dp)
                .padding(LocalSpacing.current.small)
                .background(MaterialTheme.colorScheme.surface, CircleShape),
                contentAlignment = Alignment.Center
            ){
                Image(painter = painterResource(id = image), contentDescription = emptyString)
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ){
                Text(text = termId,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = LocalSpacing.current.divider
        )

        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "Term Information",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold
            )
        }


        Divider(modifier = Modifier.padding(
            vertical = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = 0.25.dp
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small)
        ) {
            Column(modifier = Modifier.weight(5f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Term Name",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Light
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = termName,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = 0.25.dp
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small)
        ) {
            Column(modifier = Modifier.weight(5f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Academic Year",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Light
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = academicYear,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = LocalSpacing.current.divider
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small)
        ) {
            Column(modifier = Modifier.weight(5f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Start Date",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Light
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = startDate,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = LocalSpacing.current.divider
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small)
        ) {
            Column(modifier = Modifier.weight(5f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "End Date",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Light
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = endDate,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = LocalSpacing.current.divider
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small)
        ) {
            Column(modifier = Modifier.weight(5f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "No. of Days",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Light
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = numberOfDays,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = LocalSpacing.current.divider
        )
    }
}