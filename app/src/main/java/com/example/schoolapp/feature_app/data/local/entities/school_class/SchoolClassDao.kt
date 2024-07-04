package com.example.schoolapp.feature_app.data.local.entities.school_class

import androidx.room.*
import com.example.schoolapp.core.util.Constants.SchoolClass_Entity
import com.example.schoolapp.core.util.SchoolClasses
import java.util.*

@Dao
interface SchoolClassDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchoolClass(schoolClass: SchoolClassEntity)

    @Query ("DELETE FROM $SchoolClass_Entity")
    suspend fun deleteAllSchoolClasses()

    @Query ("SELECT * FROM $SchoolClass_Entity")
    suspend fun getAllSchoolClasses(): SchoolClasses?



}