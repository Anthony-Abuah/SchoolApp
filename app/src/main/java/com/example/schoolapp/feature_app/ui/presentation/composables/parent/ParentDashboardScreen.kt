package com.example.schoolapp.feature_app.ui.presentation.composables.parent

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.schoolapp.feature_app.ui.presentation.composables.bottom_nav.BottomBar
import com.example.schoolapp.feature_app.ui.presentation.composables.components.BasicScreenTopBar

@Composable
fun ParentDashboardScreen(
    navController: NavHostController,
    navigateToNoticeBoardScreen: () -> Unit,
    navigateToOpenWardsScreen: () -> Unit,
    navigateToTeachersScreen: () -> Unit,
    navigateToSubjectsScreen: () -> Unit,
    navigateToParentClassScreen: () -> Unit,
    navigateToParentTermScreen: () -> Unit,
    navigateBack: () -> Unit,
){
    Scaffold(
        topBar = {
            BasicScreenTopBar(topBarTitleText = "Parent") {
                navigateBack()
            }
        },
        bottomBar = { BottomBar(navController) }
    ){it
        ParentDashboardContent(
            onOpenNoticeBoard = navigateToNoticeBoardScreen,
            onOpenWards = navigateToOpenWardsScreen,
            onOpenTeachers = navigateToTeachersScreen,
            onOpenSubjects = navigateToSubjectsScreen,
            onOpenParentClassScreen = navigateToParentClassScreen,
            onOpenParentTerm = navigateToParentTermScreen,
            onOpenProfile = { /*TODO*/ }
        )
    }
}