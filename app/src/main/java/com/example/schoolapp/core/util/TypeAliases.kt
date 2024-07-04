package com.example.schoolapp.core.util

import com.example.schoolapp.feature_app.data.local.entities.school_class.SchoolClassEntity
import com.example.schoolapp.feature_app.data.local.entities.attendance.AttendanceEntity
import com.example.schoolapp.feature_app.data.local.entities.conduct.ConductEntity
import com.example.schoolapp.feature_app.data.local.entities.grading.GradingEntity
import com.example.schoolapp.feature_app.data.local.entities.parent.ParentEntity
import com.example.schoolapp.feature_app.data.local.entities.score.ScoreEntity
import com.example.schoolapp.feature_app.data.local.entities.student.StudentEntity
import com.example.schoolapp.feature_app.data.local.entities.subject.SubjectEntity
import com.example.schoolapp.feature_app.data.local.entities.teacher.TeacherEntity
import com.example.schoolapp.feature_app.data.local.entities.term.TermEntity


typealias SchoolClasses = List<SchoolClassEntity>
typealias Subjects = List<SubjectEntity>
typealias Students = List<StudentEntity>
typealias Gradings = List<GradingEntity>
typealias Conducts = List<ConductEntity>
typealias Terms = List<TermEntity>
typealias Attendances = List<AttendanceEntity>
typealias Scores = List<ScoreEntity>
typealias Teachers = List<TeacherEntity>
typealias Parents = List<ParentEntity>