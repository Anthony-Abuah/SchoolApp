package com.example.schoolapp.feature_app.ui.presentation.composables.admin.notice_board

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.schoolapp.core.util.Constants.emptyString
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing
import com.example.schoolapp.R
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicButton
import com.example.schoolapp.feature_app.ui.presentation.composables.components.NoticeBoardTextField

@Composable
fun NoticeBoardInfoContent(
    header: String,
    priority: String,
    termName: String,
    message: String,
    year: String,
){

    var noticeBoardMessage by remember {
        mutableStateOf(message)
    }
    var readOnlyState by remember {
        mutableStateOf(true)
    }

    BasicScreenColumn {
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(modifier = Modifier.fillMaxWidth()
                .padding(LocalSpacing.current.small),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier.weight(9f)
                    .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.Center
                ){
                    Text(text = header,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Bold
                    )
                }
                Box(modifier = Modifier.weight(1f)
                    .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.edit),
                        contentDescription = emptyString,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.noPadding),
                contentAlignment = Alignment.Center
            ) {
                NoticeBoardTextField(
                    message = noticeBoardMessage,
                    readOnlyState = true,
                    getValue = {
                        noticeBoardMessage = it
                    }
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
                text = "NoticeBoard Information",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold
            )
        }


        Divider(modifier = Modifier.padding(
            top = LocalSpacing.current.smallMedium,
            bottom = LocalSpacing.current.small),
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
                        text = "Priority",
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
                        text = priority,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
            Box(modifier = Modifier
                .weight(1f)
                .padding(LocalSpacing.current.default),
                contentAlignment = Alignment.CenterEnd
            ){
                Icon(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = emptyString,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.small),
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
                        text = "Term",
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
            Box(modifier = Modifier
                .weight(1f)
                .padding(LocalSpacing.current.default),
                contentAlignment = Alignment.CenterEnd
            ){
                Icon(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = emptyString,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.small),
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
                        text = "Year",
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
                        text = year,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
            Box(modifier = Modifier
                .weight(1f)
                .padding(LocalSpacing.current.default),
                contentAlignment = Alignment.CenterEnd
            ){
                Icon(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = emptyString,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        Divider(modifier = Modifier.padding(
            top = LocalSpacing.current.small,
            bottom = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = 0.25.dp
        )

        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "Notice Validation",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold
            )
        }


        Divider(modifier = Modifier.padding(
            top = LocalSpacing.current.smallMedium,
            bottom = LocalSpacing.current.small),
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
                        text = "Is notice still valid?",
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
                        text = "Yes",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
            Box(modifier = Modifier
                .weight(1f)
                .padding(LocalSpacing.current.default),
                contentAlignment = Alignment.CenterEnd
            ){
                Icon(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = emptyString,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.small),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = 0.25.dp
        )


        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.default)
            .clip(MaterialTheme.shapes.medium)
        ){
            BasicButton(buttonName = "Save Changes") {

            }
        }
    }
}