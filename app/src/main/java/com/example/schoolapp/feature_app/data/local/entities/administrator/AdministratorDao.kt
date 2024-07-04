package com.example.schoolapp.feature_app.data.local.entities.administrator

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Administrator_Entity
import java.util.*

@Dao
interface AdministratorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAdministrator(administrator: AdministratorEntity)

    @Query ("DELETE FROM $Administrator_Entity")
    suspend fun deleteAllAdministrators()

    @Query ("DELETE FROM $Administrator_Entity WHERE administratorId NOT IN (SELECT MIN(administratorId) FROM $Administrator_Entity GROUP BY userName)")
    suspend fun deleteDuplicateAdministrators()

    @Query ("SELECT * FROM $Administrator_Entity")
    suspend fun getAllAdministrators(): List<AdministratorEntity>?




}