package com.example.schoolapp.feature_app.ui.presentation.composables.bottom_nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.schoolapp.feature_app.ui.presentation.composables.admin.AdminNavGraph
import com.example.schoolapp.feature_app.ui.presentation.composables.parent.ParentNavGraph
import com.example.schoolapp.feature_app.ui.presentation.composables.teacher.TeacherNavGraph

@Composable
fun BottomNavGraph (){
    val mainNavController = rememberNavController()
    NavHost(
        navController = mainNavController,
        startDestination = BottomNavScreens.Admin.route)
    {
        composable(route = BottomNavScreens.Admin.route){
            AdminNavGraph(navHostController = mainNavController)
        }
        composable(route = BottomNavScreens.Parent.route){
            ParentNavGraph(navHostController = mainNavController)
        }
        composable(route = BottomNavScreens.Teacher.route){
            TeacherNavGraph(navHostController = mainNavController)
        }
    }
}

