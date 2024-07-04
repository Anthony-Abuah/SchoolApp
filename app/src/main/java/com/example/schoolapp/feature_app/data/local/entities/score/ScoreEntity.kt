package com.example.schoolapp.feature_app.data.local.entities.score

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.Score_Entity

@Entity(tableName = Score_Entity)
data class ScoreEntity(
    @PrimaryKey val scoreId: Int? = null,
    val scoreType: String,
    val scoreMark: Double?,
    val grade: String?,
    val remarks: String?
)
