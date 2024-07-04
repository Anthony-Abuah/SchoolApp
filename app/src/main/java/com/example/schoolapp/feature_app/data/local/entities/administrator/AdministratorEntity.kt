package com.example.schoolapp.feature_app.data.local.entities.administrator

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.Administrator_Entity

@Entity(tableName = Administrator_Entity)
data class AdministratorEntity(
    @PrimaryKey val administratorId: Int? = null,
    val firstName: String,
    val lastName: String,
    val userName: String,
    val password: String,
    val email: String,
    val position: String,
    val gender: String,
)
