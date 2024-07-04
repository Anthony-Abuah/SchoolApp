package com.example.schoolapp.feature_app.data.local.entities.grading

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Grading_Entity
import com.example.schoolapp.core.util.Gradings
import java.util.*

@Dao
interface GradingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGrading(grading: GradingEntity)

    @Query ("DELETE FROM $Grading_Entity")
    suspend fun deleteAllGradings()

    @Query ("DELETE FROM $Grading_Entity WHERE gradingId NOT IN (SELECT MIN(gradingId) FROM $Grading_Entity GROUP BY userName)")
    suspend fun deleteDuplicateGradings()

    @Query ("SELECT * FROM $Grading_Entity")
    suspend fun getAllGradings(): Gradings?



}