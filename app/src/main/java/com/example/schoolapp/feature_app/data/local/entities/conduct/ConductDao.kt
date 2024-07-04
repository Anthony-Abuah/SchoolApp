package com.example.schoolapp.feature_app.data.local.entities.conduct

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Conduct_Entity
import com.example.schoolapp.core.util.Conducts
import java.util.*

@Dao
interface ConductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertConduct(score: ConductEntity)

    @Query ("DELETE FROM $Conduct_Entity")
    suspend fun deleteAllConducts()

    @Query ("SELECT * FROM $Conduct_Entity")
    suspend fun getAllConducts(): Conducts?



}