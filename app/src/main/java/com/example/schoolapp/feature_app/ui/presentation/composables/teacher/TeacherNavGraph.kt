package com.example.schoolapp.feature_app.ui.presentation.composables.teacher

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.attendance.screens.AttendanceScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct.screens.ConductInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.conduct.screens.ConductScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.exam_time_table.screens.ExamTimeTableScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.screens.GradingScoreInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.screens.GradingStudentScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.grading.screens.GradingSubjectScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.report_card.screens.ReportStudentScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.report_card.screens.StudentReportCardInfoScreen
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.time_table.screens.TimeTableScreen

@Composable
fun TeacherNavGraph(
    navHostController: NavHostController
){

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = TeacherScreens.TeacherDashboard.route)
    {

        composable(route = TeacherScreens.TeacherDashboard.route){
           TeacherDashboardScreen(navController = navHostController,
               navigateToTimeTableScreen = {
                   navController.navigate(TeacherScreens.TimeTableScreen.route)
               },
               navigateToExamTimeTableScreen = {
                   navController.navigate(TeacherScreens.ExamTimeTableScreen.route)
               },
               navigateToAttendanceScreen = {
                   navController.navigate(TeacherScreens.AttendanceScreen.route)
               },
               navigateToConductScreen = {
                   navController.navigate(TeacherScreens.ConductScreen.route)
               },
               navigateToGradingStudentScreen = {
                   navController.navigate(TeacherScreens.GradingStudentScreen.route)
               },
               navigateToReportStudentScreen = {
                   navController.navigate(TeacherScreens.ReportStudentsScreen.route)
               },
           ) {
               navHostController.popBackStack()
           }
        }
        composable(route = TeacherScreens.TimeTableScreen.route){
           TimeTableScreen() {
               navController.popBackStack()
           }
        }

        composable(route = TeacherScreens.ExamTimeTableScreen.route){
           ExamTimeTableScreen() {
               navController.popBackStack()
           }
        }
        composable(route = TeacherScreens.AttendanceScreen.route){
           AttendanceScreen() {
               navController.popBackStack()
           }
        }

        composable(route = TeacherScreens.ConductScreen.route){
           ConductScreen(
               navigateToConductInfoScreen = { navController.navigate(TeacherScreens.ConductInfoScreen.route) }
           ) {
               navController.popBackStack()
           }
        }

        composable(route = TeacherScreens.ConductInfoScreen.route){
           ConductInfoScreen() {
               navController.popBackStack()
           }
        }
        composable(route = TeacherScreens.GradingStudentScreen.route){
           GradingStudentScreen(navigateToGradingSubjectScreen = {
               navController.navigate(TeacherScreens.GradingSubjectScreen.route)
           }) {
               navController.popBackStack()
           }
        }
        composable(route = TeacherScreens.GradingSubjectScreen.route){
           GradingSubjectScreen(navigateToGradingScoreInfoScreen = {
               navController.navigate(TeacherScreens.GradingScoreInfoScreen.route)
           }) {
               navController.popBackStack()
           }
        }
        composable(route = TeacherScreens.GradingScoreInfoScreen.route){
           GradingScoreInfoScreen() {
               navController.popBackStack()
           }
        }

        composable(route = TeacherScreens.ReportStudentsScreen.route){
            ReportStudentScreen(navigateToStudentReportCardInfoScreen = {
                navController.navigate(TeacherScreens.StudentReportCardInfoScreen.route)
            }) {
                navController.popBackStack()
            }
        }
        composable(route = TeacherScreens.StudentReportCardInfoScreen.route){
            StudentReportCardInfoScreen() {
                navController.popBackStack()
            }
        }
    }
}