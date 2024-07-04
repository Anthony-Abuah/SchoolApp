package com.example.schoolapp.feature_app.data.local.entities.student

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.*
import com.example.schoolapp.core.util.Constants.Student_Entity
import com.example.schoolapp.feature_app.data.local.entities.conduct.ConductEntity
import java.util.Date

@Entity(tableName = Student_Entity)
data class StudentEntity(
    @PrimaryKey val studentId: Int? = null,
    val firstName: String,
    val lastName: String,
    val otherNames: String,
    val studentName: String,
    val dateOfBirth: Date,
    val email: String,
    val gender: String,
    val photo: String,
    val parents: Parents,
    val teachers: Teachers,
    val subjects: Subjects,
    val gradings: Gradings,
    val conducts: ConductEntity,
)
