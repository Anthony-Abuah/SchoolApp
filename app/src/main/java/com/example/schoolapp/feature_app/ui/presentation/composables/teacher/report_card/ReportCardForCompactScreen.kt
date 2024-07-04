package com.example.schoolapp.feature_app.ui.presentation.composables.teacher.report_card

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import com.example.schoolapp.core.util.Constants
import com.example.schoolapp.feature_app.domain.model.SubjectScores
import com.example.schoolapp.feature_app.ui.theme.LocalSpacing
import java.util.*

@Composable
fun ReportCardForCompactScreen(
    studentName: String,
    schoolName: String,
    termName: String,
    className: String,
    vacationDate: String,
    reopeningDate: String,
    classTeacherRemarks: String,
    headTeacherRemarks: String,
    conduct: String,
    interest: String,
    attendanceDays: String,
    schoolDays: String,
    rawScore: Double,
    totalRawScore: Double,
    averageScore: Double,
    classAverageScore: Double,
    classPosition: String,
    numberOfStudents: Int,
    subjectScores: List<SubjectScores>
){
    val thisClassTeacherRemarks by remember {
        mutableStateOf(classTeacherRemarks)
    }

    val thisHeadTeacherRemarks by remember {
        mutableStateOf(headTeacherRemarks)
    }

    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .border(
            color = MaterialTheme.colorScheme.onSurface,
            width = LocalSpacing.current.extraSmall
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer)
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ){
                Text(text = schoolName.uppercase(Locale.ROOT),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.CenterStart
            ){
                Text(text = "END OF ${termName.uppercase(Locale.ROOT)}",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.error,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.CenterStart
            ){
                Text(text = "NAME : ${studentName.uppercase(Locale.ROOT)}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.CenterStart
            ){
                Text(text = "CLASS : ${className.uppercase(Locale.ROOT)}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Normal
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "VACATION DATE : ${vacationDate.uppercase(Locale.ROOT)}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "REOPENING DATE : ${reopeningDate.uppercase(Locale.ROOT)}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }


        Row(modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer)
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .weight(2f)
                .fillMaxHeight()
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "SUBJECT",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "C.S",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "E.S",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "0.T.S",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Gra",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Pos",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
            Box(modifier = Modifier
                .weight(1f)
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Rem",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

        }


        subjectScores.forEach { subjectScore ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(LocalSpacing.current.large)
                .background(MaterialTheme.colorScheme.background)
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight()
                    .border(
                        color = MaterialTheme.colorScheme.onSurface,
                        width = LocalSpacing.current.borderStroke
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LocalSpacing.current.small),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = subjectScore.subjectName.uppercase(Locale.ROOT),
                            textAlign = TextAlign.Start,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .border(
                        color = MaterialTheme.colorScheme.onSurface,
                        width = LocalSpacing.current.borderStroke
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LocalSpacing.current.small),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${subjectScore.classScore}",
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .border(
                        color = MaterialTheme.colorScheme.onSurface,
                        width = LocalSpacing.current.borderStroke
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LocalSpacing.current.small),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${subjectScore.examScore}",
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onBackground,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .border(
                        color = MaterialTheme.colorScheme.onSurface,
                        width = LocalSpacing.current.borderStroke
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LocalSpacing.current.small),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${subjectScore.overallTotalScore}",
                            style = MaterialTheme.typography.bodySmall,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onBackground,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .border(
                        color = MaterialTheme.colorScheme.onSurface,
                        width = LocalSpacing.current.borderStroke
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LocalSpacing.current.small),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = subjectScore.grade.take(1).uppercase(Locale.ROOT),
                            style = MaterialTheme.typography.bodySmall,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onBackground,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }

                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .border(
                        color = MaterialTheme.colorScheme.onSurface,
                        width = LocalSpacing.current.borderStroke
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LocalSpacing.current.small),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = subjectScore.position.take(4).uppercase(Locale.ROOT),
                            style = MaterialTheme.typography.bodySmall,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onBackground,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .border(
                        color = MaterialTheme.colorScheme.onSurface,
                        width = LocalSpacing.current.borderStroke
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(LocalSpacing.current.small),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = subjectScore.remarks.take(2).uppercase(Locale.ROOT),
                            style = MaterialTheme.typography.bodySmall,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onBackground,
                            overflow = TextOverflow.Ellipsis,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }

            }

        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.noPadding),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier
                    .weight(9f)
                    .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ){
                    Text(text = "CLASS TEACHER'S REMARKS:",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }
                Box(modifier = Modifier
                    .weight(1f)
                    .padding(LocalSpacing.current.small)
                    .clickable { },
                    contentAlignment = Alignment.CenterEnd
                ){
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = Constants.emptyString,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Box(modifier = Modifier
                .padding(horizontal = LocalSpacing.current.small)
                .fillMaxWidth(),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(text = thisClassTeacherRemarks,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start,
                    textDecoration = TextDecoration.None,
                    fontWeight = FontWeight.Normal
                )
            }
            Spacer(modifier = Modifier.height(LocalSpacing.current.small))
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.noPadding),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier
                    .weight(9f)
                    .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ){
                    Text(text = "CONDUCT:",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }
                Box(modifier = Modifier
                    .weight(1f)
                    .padding(LocalSpacing.current.small)
                    .clickable { },
                    contentAlignment = Alignment.CenterEnd
                ){
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = Constants.emptyString,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Box(modifier = Modifier
                .padding(horizontal = LocalSpacing.current.small)
                .fillMaxWidth(),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(text = conduct,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start,
                    textDecoration = TextDecoration.None,
                    fontWeight = FontWeight.Normal
                )
            }
            Spacer(modifier = Modifier.height(LocalSpacing.current.small))
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.noPadding),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier
                    .weight(9f)
                    .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ){
                    Text(text = "INTEREST:",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }
                Box(modifier = Modifier
                    .weight(1f)
                    .padding(LocalSpacing.current.small)
                    .clickable { },
                    contentAlignment = Alignment.CenterEnd
                ){
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = Constants.emptyString,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Box(modifier = Modifier
                .padding(horizontal = LocalSpacing.current.small)
                .fillMaxWidth(),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(text = interest,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start,
                    textDecoration = TextDecoration.None,
                    fontWeight = FontWeight.Normal
                )
            }
            Spacer(modifier = Modifier.height(LocalSpacing.current.small))
        }


        Row(modifier = Modifier
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            )
            .fillMaxWidth()
            .padding(LocalSpacing.current.noPadding),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .weight(9f)
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.CenterStart
            ){
                Text(text = "ATTENDANCE: $attendanceDays OUT OF $schoolDays DAYS",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start,
                    textDecoration = TextDecoration.None,
                    fontWeight = FontWeight.Normal
                )
            }
        }

        Row(modifier = Modifier
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            )
            .fillMaxWidth()
            .padding(LocalSpacing.current.noPadding),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .weight(9f)
                .padding(LocalSpacing.current.small),
                contentAlignment = Alignment.CenterStart
            ){
                Text(text = "RAW SCORE: $rawScore OUT OF $totalRawScore",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start,
                    textDecoration = TextDecoration.None,
                    fontWeight = FontWeight.Normal
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "CLASS POSITION: $classPosition",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "NO. ON ROLL: $numberOfStudents",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .weight(1.1f)
                .fillMaxHeight()
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "STUDENT AVERAGE: $averageScore",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .border(
                    color = MaterialTheme.colorScheme.onSurface,
                    width = LocalSpacing.current.borderStroke
                ),
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "CLASS AVERAGE: $classAverageScore",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }


        Column(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(LocalSpacing.current.noPadding),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier
                    .weight(9f)
                    .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ){
                    Text(text = "HEAD TEACHER'S REMARKS:",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }
                Box(modifier = Modifier
                    .weight(1f)
                    .padding(LocalSpacing.current.small)
                    .clickable { },
                    contentAlignment = Alignment.CenterEnd
                ){
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = Constants.emptyString,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Box(modifier = Modifier
                .padding(horizontal = LocalSpacing.current.small)
                .fillMaxWidth(),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(text = thisHeadTeacherRemarks,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start,
                    textDecoration = TextDecoration.None,
                    fontWeight = FontWeight.Normal
                )
            }
            Spacer(modifier = Modifier.height(LocalSpacing.current.small))
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(
                color = MaterialTheme.colorScheme.onSurface,
                width = LocalSpacing.current.borderStroke
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Box(
                modifier = Modifier.padding(LocalSpacing.current.small),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "ABBREVIATIONS",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Start,
                    textDecoration = TextDecoration.None,
                    fontWeight = FontWeight.Normal
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalSpacing.current.noPadding),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "C.S: Class Score (50%)",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "E.S: Exams Score (50%)",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalSpacing.current.noPadding),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "O.T.S: Overall Total Score (100%)",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Gra: Grade",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalSpacing.current.noPadding),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Pos: Class Position",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(LocalSpacing.current.small),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Rem: Remarks",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Start,
                        textDecoration = TextDecoration.None,
                        fontWeight = FontWeight.Normal
                    )
                }

            }

        }

    }

}

