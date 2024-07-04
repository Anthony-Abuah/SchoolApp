package com.example.schoolapp.core.util

import android.graphics.Color
import com.example.schoolapp.core.util.Constants.longDateFormat
import com.example.schoolapp.core.util.Constants.shortDateFormat
import com.example.schoolapp.feature_app.ui.theme.green20
import com.example.schoolapp.feature_app.ui.theme.green50
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

object Functions {

    fun LocalDate.toDate(): Date = Date.from(this.atStartOfDay(ZoneId.systemDefault()).toInstant())
    val shortDateFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern(shortDateFormat)!!
    val longDateFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern(longDateFormat)!!

    fun findDuplicates(list: List<Any>) : List<Any>{
        val duplicates = mutableListOf<Any>()
        val uniqueValues = mutableSetOf<Any>()
        list.forEach{value->
            if(!uniqueValues.add(value)){
                duplicates.add(value)
            }
        }
        return duplicates
    }

    fun isPresentColor(isDarkTheme : Boolean): androidx.compose.ui.graphics.Color {
        return if (isDarkTheme) green50 else green20
    }

    private val step1_Day = Recursion(field = ChronoUnit.DAYS, step = 1)
    fun createListOfDates(startDate: LocalDate, endDate: LocalDate) : List<LocalDate>{
        var currentDate = startDate
        val listOfDates = mutableListOf<LocalDate>()
        while (currentDate.isBefore(endDate.plusDays(1))){
            listOfDates.add(currentDate)
            currentDate = currentDate.plus(step1_Day.step, step1_Day.field)
        }
        return listOfDates
    }
}