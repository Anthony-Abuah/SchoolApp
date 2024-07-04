package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
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
import com.example.schoolapp.R
import com.example.schoolapp.core.util.Constants.Conduct
import com.example.schoolapp.core.util.Constants.Interest
import com.example.schoolapp.core.util.Constants.emptyString
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicButton
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenColumn
import com.example.schoolapp.feature_app.ui.presentation.composables.components.ConductTextField
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing

@Composable
fun ConductInfoContent(
    image: Int,
    studentId: String,
    email: String,
    studentFullName: String,
    className: String,
    termName: String,
    conduct: String,
    interest: String,
){

    var thisConductReadOnlyState by remember {
        mutableStateOf(true)
    }
    var thisInterestReadOnlyState by remember {
        mutableStateOf(true)
    }
    var thisConduct by remember {
        mutableStateOf(conduct)
    }
    var thisInterest by remember {
        mutableStateOf(interest)
    }

    BasicScreenColumn {
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.default),
            contentAlignment = Alignment.Center
        ){
            Text(text = "$className, $termName",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.SemiBold
            )
        }
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
                Text(text = studentFullName,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Id: $studentId",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Normal
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "email: $email",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primary,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Normal
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
                text = "Conduct Information",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold
            )
        }


        Divider(modifier = Modifier.padding(
            top = LocalSpacing.current.smallMedium,
            bottom = LocalSpacing.current.default),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = 0.25.dp
        )

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
                    contentAlignment = Alignment.CenterStart
                ){
                    Text(text = Conduct,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Box(modifier = Modifier.weight(1f)
                    .padding(LocalSpacing.current.small)
                    .clickable { thisConductReadOnlyState =! thisConductReadOnlyState },
                    contentAlignment = Alignment.CenterStart
                ){
                    Icon(
                        imageVector = Icons.Default.Edit,
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
                ConductTextField(
                    height = 125.dp,
                    conduct = thisConduct,
                    readOnlyState = thisConductReadOnlyState,
                    getValue = {
                        thisConduct = it
                    }
                )
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.smallMedium),
            color = MaterialTheme.colorScheme.onBackground,
            thickness = 0.25.dp
        )

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
                    contentAlignment = Alignment.CenterStart
                ){
                    Text(text = Interest,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Box(modifier = Modifier.weight(1f)
                    .padding(LocalSpacing.current.small)
                    .clickable { thisInterestReadOnlyState =! thisInterestReadOnlyState },
                    contentAlignment = Alignment.CenterStart
                ){
                    Icon(
                        imageVector = Icons.Default.Edit,
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
                ConductTextField(
                    height = 125.dp,
                    conduct = thisInterest,
                    readOnlyState = thisInterestReadOnlyState,
                    getValue = {
                        thisInterest = it
                    }
                )
            }
        }

        Divider(modifier = Modifier.padding(vertical = LocalSpacing.current.smallMedium),
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