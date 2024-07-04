package com.example.schoolapp.feature_app.data.local.entities.school_class

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.SchoolClass_Entity
import com.example.schoolapp.core.util.Students
import com.example.schoolapp.core.util.Teachers

@Entity(tableName = SchoolClass_Entity)
data class SchoolClassEntity(
    @PrimaryKey val classId: Int? = null,
    val className: String,
    val classStage: Int,
    val students: Students?,
    val numberOfBoys: String?,
    val numberOfGirls: String?,
    val teachers: Teachers?
)
