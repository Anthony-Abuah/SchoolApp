package com.example.schoolapp.feature_app.data.local.entities.parent

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.Parent_Entity
import com.example.schoolapp.core.util.Students

@Entity(tableName = Parent_Entity)
data class ParentEntity(
    @PrimaryKey val parentId: Int? = null,
    val firstName: String,
    val lastName: String,
    val userName: String,
    val password: String,
    val email: String,
    val gender: String,
    val contacts: List<String>,
    val wards: Students,

)
