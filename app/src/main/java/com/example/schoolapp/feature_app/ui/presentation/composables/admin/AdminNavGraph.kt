package com.example.schoolapp.feature_app.ui.presentation.composables.admin

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator.screens.AdministratorInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.administrator.screens.AdministratorScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.classes.screens.SchoolClassInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.classes.screens.SchoolClassScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.notice_board.screens.NoticeBoardInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.notice_board.screens.NoticeBoardScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.parent.screens.ParentInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.parent.screens.ParentScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.subject.screens.SubjectInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.subject.screens.SubjectScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.screens.TeacherInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.teacher.screens.TeacherScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.term.screens.TermInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.term.screens.TermScreen

@Composable
fun AdminNavGraph(
    navHostController: NavHostController
){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AdminScreens.MainAdminPage.route)
    {
        composable(route = AdminScreens.MainAdminPage.route){
            MainAdminScreen(navController = navHostController,
                navigateToTeacherScreen = {
                    navController.navigate(AdminScreens.Teachers.route)
                },
                navigateToSubjectScreen = {
                    navController.navigate(AdminScreens.Subjects.route)
                },
                navigateToSchoolClassScreen = {
                    navController.navigate(AdminScreens.Classes.route)
                },
                navigateToParentsScreen = {
                    navController.navigate(AdminScreens.Parents.route)
                },
                navigateToNoticeBoardScreen = {
                    navController.navigate(AdminScreens.NoticeBoard.route)
                },
                navigateToTermScreen = {
                    navController.navigate(AdminScreens.Terms.route)
                },
                navigateToAdministratorScreen = {
                    navController.navigate(AdminScreens.Admins.route)
                },
                navigateBack = {
                    navHostController.popBackStack()
                }
            )
        }

        composable(route = AdminScreens.Teachers.route){
            TeacherScreen(
                navigateBack = { navController.popBackStack() }
            ) {
                navController.navigate(AdminScreens.TeacherInfo.route)
            }
        }
        composable(route = AdminScreens.TeacherInfo.route){
            TeacherInfoScreen {
                navController.popBackStack()
            }
        }


        composable(route = AdminScreens.Subjects.route){
            SubjectScreen(
                navigateBack = { navController.popBackStack() }
            ) {
                navController.navigate(AdminScreens.SubjectInfo.route)
            }
        }
        composable(route = AdminScreens.SubjectInfo.route){
            SubjectInfoScreen {
                navController.popBackStack()
            }
        }

        composable(route = AdminScreens.Parents.route){
            ParentScreen(
                navigateBack = { navController.popBackStack() }
            ) {
                navController.navigate(AdminScreens.ParentInfo.route)
            }
        }
        composable(route = AdminScreens.ParentInfo.route){
            ParentInfoScreen {
                navController.popBackStack()
            }
        }

        composable(route = AdminScreens.NoticeBoard.route){
            NoticeBoardScreen(
                navigateBack = { navController.popBackStack() }
            ) {
                navController.navigate(AdminScreens.NoticeBoardInfo.route)
            }
        }
        composable(route = AdminScreens.NoticeBoardInfo.route){
            NoticeBoardInfoScreen {
                navController.popBackStack()
            }
        }

        composable(route = AdminScreens.Classes.route){
            SchoolClassScreen(
                navigateBack = { navController.popBackStack() }
            ) {
                navController.navigate(AdminScreens.ClassInfo.route)
            }
        }
        composable(route = AdminScreens.ClassInfo.route){
            SchoolClassInfoScreen {
                navController.popBackStack()
            }
        }

        composable(route = AdminScreens.Terms.route){
            TermScreen(
                navigateBack = { navController.popBackStack() }
            ) {
                navController.navigate(AdminScreens.TermInfo.route)
            }
        }
        composable(route = AdminScreens.TermInfo.route){
            TermInfoScreen {
                navController.popBackStack()
            }
        }
        composable(route = AdminScreens.Admins.route){
            AdministratorScreen(
                navigateBack = { navController.popBackStack() }
            ) {
                navController.navigate(AdminScreens.AdminInfo.route)
            }
        }
        composable(route = AdminScreens.AdminInfo.route){
            AdministratorInfoScreen {
                navController.popBackStack()
            }
        }


    }
}