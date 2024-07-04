package com.example.schoolapp.feature_app.data.local.entities.teacher

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.Teacher_Entity
import com.example.schoolapp.core.util.Subjects

@Entity(tableName = Teacher_Entity)
data class TeacherEntity(
    @PrimaryKey val teacherId: Int? = null,
    val firstName: String,
    val lastName: String,
    val userName: String,
    val password: String,
    val email: String,
    val gender: String,
    val contacts: List<String>,
    val subjects: Subjects,
)
