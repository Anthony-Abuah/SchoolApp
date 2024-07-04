package com.example.schoolapp.feature_app.ui.presentation.composables.admin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.schoolapp.feature_app.ui.presentation.composables.bottom_nav.BottomBar
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar

@Composable
fun MainAdminScreen(
    navController: NavHostController,
    navigateToTeacherScreen: () -> Unit,
    navigateToSubjectScreen: () -> Unit,
    navigateToSchoolClassScreen: () -> Unit,
    navigateToParentsScreen: () -> Unit,
    navigateToNoticeBoardScreen: () -> Unit,
    navigateToTermScreen: () -> Unit,
    navigateToAdministratorScreen: () -> Unit,
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            BasicScreenTopBar(topBarTitleText = "Admin") {
                navigateBack()
            }
        },
        bottomBar = { BottomBar(navController) }
    ){it
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            MainAdminContent(
                onOpenTeachers = navigateToTeacherScreen,
                onOpenParents = navigateToParentsScreen,
                onOpenSubjects = navigateToSubjectScreen,
                onOpenClasses = navigateToSchoolClassScreen,
                onOpenTerms = navigateToTermScreen,
                onOpenNoticeBoards = navigateToNoticeBoardScreen,
                onOpenAdmins = navigateToAdministratorScreen
            )
        }
    }
}