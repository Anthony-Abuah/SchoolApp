package com.example.schoolapp.feature_app.data.local.entities.attendance

import androidx.room.*
import com.example.schoolapp.core.util.Attendances
import com.example.schoolapp.core.util.Constants.Attendance_Entity
import java.util.*

@Dao
interface AttendanceDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAttendance(attendance: AttendanceEntity)

    @Query ("DELETE FROM $Attendance_Entity")
    suspend fun deleteAllAttendances()

    @Query ("DELETE FROM $Attendance_Entity WHERE attendanceId NOT IN (SELECT MIN(attendanceId) FROM $Attendance_Entity GROUP BY userName)")
    suspend fun deleteDuplicateAttendances()

    @Query ("SELECT * FROM $Attendance_Entity")
    suspend fun getAllAttendances(): Attendances?



}