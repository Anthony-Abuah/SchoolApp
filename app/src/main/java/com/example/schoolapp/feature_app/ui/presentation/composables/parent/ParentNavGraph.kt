package com.example.schoolapp.feature_app.ui.presentation.composables.parent

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.classes.screens.ParentClassInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.classes.screens.ParentClassScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.notice_board.screens.ParentNoticeBoardInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.notice_board.screens.ParentNoticeBoardScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.subjects.ParentSubjectScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.subjects.screens.ParentSubjectInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.teacher.screens.ParentTeacherInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.teacher.screens.ParentTeacherScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.term.screens.ParentTermInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.term.screens.ParentTermScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.wards.screens.ParentWardInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.wards.screens.ParentWardScreen

@Composable
fun ParentNavGraph(
    navHostController: NavHostController
){

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ParentScreens.ParentDashboard.route)
    {

        composable(route = ParentScreens.ParentDashboard.route){
           ParentDashboardScreen(navController = navHostController,
               navigateToNoticeBoardScreen = {
                   navController.navigate(ParentScreens.ParentNoticeBoardScreen.route)
               },
               navigateToOpenWardsScreen = {
                   navController.navigate(ParentScreens.ParentWardScreen.route)
               },
               navigateToTeachersScreen = {
                   navController.navigate(ParentScreens.ParentTeacherScreen.route)
               },
               navigateToSubjectsScreen = {
                   navController.navigate(ParentScreens.ParentSubjectScreen.route)
               },
               navigateToParentClassScreen = {
                   navController.navigate(ParentScreens.ParentClassScreen.route)
               },
               navigateToParentTermScreen = {
                   navController.navigate(ParentScreens.ParentTermScreen.route)
               },
           ) {
               navHostController.popBackStack()
           }
        }
        composable(route = ParentScreens.ParentNoticeBoardScreen.route){
           ParentNoticeBoardScreen(
               navigateToNoticeBoardInfoScreen = {
                   navController.navigate(ParentScreens.ParentNoticeBoardInfoScreen.route)
               }
           ) {
               navController.popBackStack()
           }
        }

        composable(route = ParentScreens.ParentNoticeBoardInfoScreen.route){
           ParentNoticeBoardInfoScreen() {
               navController.popBackStack()
           }
        }

        composable(route = ParentScreens.ParentWardScreen.route){
           ParentWardScreen(
               navigateToGradingSubjectScreen = {
                   navController.navigate(ParentScreens.ParentWardInfoScreen.route)
               }) {
               navController.popBackStack()
           }
        }

        composable(route = ParentScreens.ParentWardInfoScreen.route){
            ParentWardInfoScreen() {
                navController.popBackStack()
            }
        }
        composable(route = ParentScreens.ParentTeacherScreen.route){
           ParentTeacherScreen(
               navigateToParentTeacherInfoScreen = {
                   navController.navigate(ParentScreens.ParentTeacherInfoScreen.route)
               }) {
               navController.popBackStack()
           }
        }

        composable(route = ParentScreens.ParentTeacherInfoScreen.route){
            ParentTeacherInfoScreen() {
                navController.popBackStack()
            }
        }

        composable(route = ParentScreens.ParentSubjectInfoScreen.route){
            ParentSubjectInfoScreen() {
                navController.popBackStack()
            }
        }
        composable(route = ParentScreens.ParentSubjectScreen.route){
           ParentSubjectScreen(
               navigateToSubjectInfoScreen = {
                   navController.navigate(ParentScreens.ParentSubjectInfoScreen.route)
               }) {
               navController.popBackStack()
           }
        }

        composable(route = ParentScreens.ParentClassInfoScreen.route){
            ParentClassInfoScreen() {
                navController.popBackStack()
            }
        }
        composable(route = ParentScreens.ParentClassScreen.route){
           ParentClassScreen(
               navigateToParentClassInfoScreen = {
                   navController.navigate(ParentScreens.ParentClassInfoScreen.route)
               }) {
               navController.popBackStack()
           }
        }

        composable(route = ParentScreens.ParentTermInfoScreen.route){
            ParentTermInfoScreen() {
                navController.popBackStack()
            }
        }

        composable(route = ParentScreens.ParentTermScreen.route){
           ParentTermScreen(
               navigateToTermInfoScreen = {
                   navController.navigate(ParentScreens.ParentTermInfoScreen.route)
               }) {
               navController.popBackStack()
           }
        }

    }
}