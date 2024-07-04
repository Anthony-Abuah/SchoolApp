package com.example.schoolapp.feature_app.data.local.entities.term

import androidx.room.*
import com.example.schoolapp.core.util.Constants.Term_Entity
import com.example.schoolapp.core.util.Terms
import java.util.*

@Dao
interface TermDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTerm(term: TermEntity)

    @Query ("DELETE FROM $Term_Entity")
    suspend fun deleteAllTerms()

    @Query ("DELETE FROM $Term_Entity WHERE termId NOT IN (SELECT MIN(termId) FROM $Term_Entity GROUP BY userName)")
    suspend fun deleteDuplicateTerms()

    @Query ("SELECT * FROM $Term_Entity")
    suspend fun getAllTerms(): Terms?



}