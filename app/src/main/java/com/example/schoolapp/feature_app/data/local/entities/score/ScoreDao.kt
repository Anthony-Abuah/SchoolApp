package com.example.schoolapp.feature_app.data.local.entities.score

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Score_Entity
import com.example.schoolapp.core.util.Scores
import java.util.*

@Dao
interface ScoreDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertScore(score: ScoreEntity)

    @Query ("DELETE FROM $Score_Entity")
    suspend fun deleteAllScores()

    @Query ("DELETE FROM $Score_Entity WHERE scoreId NOT IN (SELECT MIN(scoreId) FROM $Score_Entity GROUP BY userName)")
    suspend fun deleteDuplicateScores()

    @Query ("SELECT * FROM $Score_Entity")
    suspend fun getAllScores(): Scores?



}