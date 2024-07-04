package com.example.schoolapp.feature_app.ui.presentation.composables.admin

sealed class AdminScreens(val route: String){
    object Teachers: AdminScreens("to_admin_teachers_screen")
    object TeacherInfo: AdminScreens("to_admin_teacher_info_screen")
    object Parents: AdminScreens("to_admin_parents_screen")
    object ParentInfo: AdminScreens("to_admin_parent_info_screen")
    object Subjects: AdminScreens("to_admin_subjects_screen")
    object SubjectInfo: AdminScreens("to_admin_subject_info_screen")
    object Classes: AdminScreens("to_admin_classes_screen")
    object ClassInfo: AdminScreens("to_admin_class_info_screen")
    object Terms: AdminScreens("to_admin_terms_screen")
    object TermInfo: AdminScreens("to_admin_term_info_screen")
    object NoticeBoard: AdminScreens("to_admin_notice_boards_screen")
    object NoticeBoardInfo: AdminScreens("to_admin_notice_board_info_screen")
    object Admins: AdminScreens("to_admin_admins_screen")
    object AdminInfo: AdminScreens("to_admin_admin_info_screen")
    object MainAdminPage: AdminScreens("to_main_admin_page_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach {arg->
                append("/$arg")
            }
        }
    }
}