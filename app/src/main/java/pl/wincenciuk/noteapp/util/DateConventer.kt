package pl.wincenciuk.noteapp.util

import androidx.room.TypeConverter
import java.sql.Timestamp
import java.util.Date

class DateConventer {
    @TypeConverter
    fun timeStampFromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun dateFromTimestamp(timestamp: Long): Date? {
        return Date(timestamp)
    }
}