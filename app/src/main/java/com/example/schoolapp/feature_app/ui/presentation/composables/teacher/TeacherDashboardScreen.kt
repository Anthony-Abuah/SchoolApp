package com.example.schoolapp.feature_app.ui.presentation.composables.teacher

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.schoolapp.feature_app.ui.presentation.composables.bottom_nav.BottomBar
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar

@Composable
fun TeacherDashboardScreen(
    navController: NavHostController,
    navigateToTimeTableScreen: () -> Unit,
    navigateToExamTimeTableScreen: () -> Unit,
    navigateToAttendanceScreen: () -> Unit,
    navigateToConductScreen: () -> Unit,
    navigateToGradingStudentScreen: () -> Unit,
    navigateToReportStudentScreen: () -> Unit,
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            BasicScreenTopBar(topBarTitleText = "Teacher") {
                navigateBack()
            }
        },
        bottomBar = { BottomBar(navController) }
    ){it
        TeacherDashboardContent(
            onOpenTimeTables = navigateToTimeTableScreen,
            onOpenExamTimeTables = navigateToExamTimeTableScreen,
            onOpenAttendances = navigateToAttendanceScreen,
            onOpenConducts = navigateToConductScreen,
            onOpenGrades = navigateToGradingStudentScreen,
            onOpenReport = navigateToReportStudentScreen,
            onOpenProfile = { /*TODO*/ }
        )
    }
}