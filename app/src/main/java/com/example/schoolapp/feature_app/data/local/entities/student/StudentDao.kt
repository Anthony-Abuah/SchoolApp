package com.example.schoolapp.feature_app.data.local.entities.student

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Student_Entity
import com.example.schoolapp.core.util.Students
import java.util.*

@Dao
interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: StudentEntity)

    @Query ("DELETE FROM $Student_Entity")
    suspend fun deleteAllStudents()

    @Query ("DELETE FROM $Student_Entity WHERE studentId NOT IN (SELECT MIN(studentId) FROM $Student_Entity GROUP BY studentName)")
    suspend fun deleteDuplicateStudents()

    @Query ("SELECT * FROM $Student_Entity")
    suspend fun getAllStudents(): Students?



}