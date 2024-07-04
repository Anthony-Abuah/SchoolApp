package com.example.schoolapp.feature_app.data.local.entities.conduct

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Attendances
import com.example.schoolapp.core.util.Constants.Conduct_Entity
import com.example.schoolapp.core.util.Teachers

@Entity(tableName = Conduct_Entity)
data class ConductEntity(
    @PrimaryKey val conductId: Int? = null,
    val studentName: String,
    val studentClass: String,
    val teachers: Teachers?,
    val interests: String?,
    val conduct: String?,
    val attendances: Attendances?,
)
