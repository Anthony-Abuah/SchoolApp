package com.example.schoolapp.feature_app.data.local.entities.grading

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.Grading_Entity
import com.example.schoolapp.core.util.Scores
import com.example.schoolapp.core.util.Teachers
import com.example.schoolapp.feature_app.data.local.entities.student.StudentEntity
import com.example.schoolapp.feature_app.data.local.entities.teacher.TeacherEntity
import com.example.schoolapp.feature_app.data.local.entities.term.TermEntity

@Entity(tableName = Grading_Entity)
data class GradingEntity(
    @PrimaryKey val gradingId: Int? = null,
    val student: StudentEntity,
    val subjectName: String,
    val teacher: TeacherEntity,
    val scores: Scores?,
    val classAverage: Double?,
    val term: TermEntity,
    val finalGrade: Char?,
    val teacherRemarks: String?,
    val gradeRemarks: String?

)
