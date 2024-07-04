package com.example.schoolapp.feature_app.data.local.entities.subject

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.Subject_Entity
import com.example.schoolapp.core.util.SchoolClasses
import com.example.schoolapp.core.util.Teachers

@Entity(tableName = Subject_Entity)
data class SubjectEntity(
    @PrimaryKey val subjectId: Int? = null,
    val subjectName: String,
    val classes: SchoolClasses?,
    val teachers: Teachers?
)
