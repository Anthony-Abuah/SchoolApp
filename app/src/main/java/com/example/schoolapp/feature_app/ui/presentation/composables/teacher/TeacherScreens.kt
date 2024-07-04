package com.example.schoolapp.feature_app.ui.presentation.composables.teacher

sealed class TeacherScreens(val route: String){
    object TeacherDashboard: TeacherScreens("to_teacher_dashboard_screen")
    object TimeTableScreen: TeacherScreens("to_time_table_screen")
    object ExamTimeTableScreen: TeacherScreens("to_exam_time_table_screen")
    object AttendanceScreen: TeacherScreens("to_attendance_screen")
    object ConductScreen: TeacherScreens("to_conduct_screen")
    object ConductInfoScreen: TeacherScreens("to_conduct_info_screen")
    object GradingSubjectScreen: TeacherScreens("to_grading_subject_screen")
    object GradingStudentScreen: TeacherScreens("to_grading_student_screen")
    object GradingScoreInfoScreen: TeacherScreens("to_grading_score_info_screen")
    object ReportStudentsScreen: TeacherScreens("to_report_students_screen")
    object StudentReportCardInfoScreen: TeacherScreens("to_student_report_card_info_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach {arg->
                append("/$arg")
            }
        }
    }
}