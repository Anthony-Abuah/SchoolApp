package com.example.schoolapp.feature_app.ui.presentation.composables.parent

sealed class ParentScreens(val route: String){
    object ParentDashboard: ParentScreens("to_parent_dashboard_screen")
    object ParentNoticeBoardScreen: ParentScreens("to_parent_notice_board_screen")
    object ParentNoticeBoardInfoScreen: ParentScreens("to_parent_notice_board_info_screen")
    object ParentWardScreen: ParentScreens("to_parent_ward_screen")
    object ParentWardInfoScreen: ParentScreens("to_parent_ward_info_screen")
    object ParentTeacherScreen: ParentScreens("to_parent_teacher_screen")
    object ParentTeacherInfoScreen: ParentScreens("to_parent_teacher_info_screen")
    object ParentSubjectScreen: ParentScreens("to_parent_subject_screen")
    object ParentSubjectInfoScreen: ParentScreens("to_parent_subject_info_screen")
    object ParentClassScreen: ParentScreens("to_parent_class_screen")
    object ParentClassInfoScreen: ParentScreens("to_parent_class_info_screen")
    object ParentTermScreen: ParentScreens("to_parent_term_screen")
    object ParentTermInfoScreen: ParentScreens("to_parent_term_info_screen")




}