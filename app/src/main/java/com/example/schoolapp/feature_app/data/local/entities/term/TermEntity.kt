package com.example.schoolapp.feature_app.data.local.entities.term

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.Term_Entity
import java.util.Date

@Entity(tableName = Term_Entity)
data class TermEntity(
    @PrimaryKey val termId: Int? = null,
    val termName: String,
    val uniqueTermName: String,
    val year: Int?,
    val startDate: Date,
    val endDate: Date,
    val numberOfDays: Int?
)
