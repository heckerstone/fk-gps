package com.android.bluetooths.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LocationData::class], version = 1)
abstract class RoomDB: RoomDatabase() {
    abstract fun LocationDao(): LocationDao
}