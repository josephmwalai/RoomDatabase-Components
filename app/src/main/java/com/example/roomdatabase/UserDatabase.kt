package com.example.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class],
        version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun UserDAO(): UserDAO

    companion object{
        lateinit var database: AppDatabase

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "user_db"
            ).build()
    }
}