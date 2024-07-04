package com.example.schoolapp.feature_app.data.local.entities.attendance

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.schoolapp.core.util.Constants.Attendance_Entity
import com.example.schoolapp.feature_app.data.local.entities.student.StudentEntity
import com.example.schoolapp.feature_app.data.local.entities.term.TermEntity
import java.util.Date

@Entity(tableName = Attendance_Entity)
data class AttendanceEntity(
    @PrimaryKey val attendanceId: Int? = null,
    val studentName: String,
    val term: TermEntity?,
    val attendanceDates: List<Date>?,
    val absentDates: List<Date>?,
    val numberOfAttendedDays: Int? = attendanceDates?.size,
    val numberOfAbsentDays: Int? = absentDates?.size,
    val totalSchoolDays: Int? = numberOfAttendedDays?.let { numberOfAbsentDays?.plus(it) }
)
