package com.example.schoolapp.feature_app.ui.presentation.composables.bottom_nav

import com.example.schoolapp.R


sealed class BottomNavScreens(
    val name: String,
    val route: String,
    val focused_icon: Int,
    val unfocused_icon: Int,
){
    object Admin: BottomNavScreens(
        name = "Admin",
        route = "to_admin",
        focused_icon = R.drawable.admin_selected,
        unfocused_icon = R.drawable.admin_unselected
    )
    object Parent: BottomNavScreens(
        name = "Parent",
        route = "to_parent",
        focused_icon = R.drawable.parent_selected,
        unfocused_icon = R.drawable.parent_unselected
    )
    object Teacher: BottomNavScreens(
        name = "Teacher",
        route = "to_teacher",
        focused_icon = R.drawable.teacher_selected,
        unfocused_icon = R.drawable.teacher_unselected
    )
}