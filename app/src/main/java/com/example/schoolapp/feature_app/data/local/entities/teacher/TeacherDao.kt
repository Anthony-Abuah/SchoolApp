package com.example.schoolapp.feature_app.data.local.entities.teacher

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Teacher_Entity
import com.example.schoolapp.core.util.Teachers
import java.util.*

@Dao
interface TeacherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacher(teacher: TeacherEntity)

    @Query ("DELETE FROM $Teacher_Entity")
    suspend fun deleteAllTeachers()

    @Query ("DELETE FROM $Teacher_Entity WHERE teacherId NOT IN (SELECT MIN(teacherId) FROM $Teacher_Entity GROUP BY userName)")
    suspend fun deleteDuplicateTeachers()

    @Query ("SELECT * FROM $Teacher_Entity")
    suspend fun getAllTeachers(): Teachers?



}