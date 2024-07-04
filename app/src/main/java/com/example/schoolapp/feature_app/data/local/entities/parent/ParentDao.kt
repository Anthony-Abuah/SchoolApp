package com.example.schoolapp.feature_app.data.local.entities.parent

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Parent_Entity
import com.example.schoolapp.core.util.Parents
import java.util.*

@Dao
interface ParentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertParent(parent: ParentEntity)

    @Query ("DELETE FROM $Parent_Entity")
    suspend fun deleteAllParents()

    @Query ("SELECT * FROM $Parent_Entity")
    suspend fun getAllParents(): Parents?



}