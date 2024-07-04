package com.example.schoolapp.feature_app.data.local.entities.subject

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Subject_Entity
import com.example.schoolapp.core.util.Subjects
import java.util.*

@Dao
interface SubjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: SubjectEntity)

    @Query ("DELETE FROM $Subject_Entity")
    suspend fun deleteAllSubjects()

    @Query ("SELECT * FROM $Subject_Entity")
    suspend fun getAllSubjects(): Subjects?



}