package com.example.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.room.entity.TextEntity
import com.example.room.dao.TextDao
import com.example.room.dao.WordDao
import com.example.room.entity.WordEntity

@Database(entities = [TextEntity::class,WordEntity::class], version = 2)
abstract class TextDatabase : RoomDatabase(){
    //이 파일이 내가알던 helper 역할
    abstract fun textDao() : TextDao
    abstract fun wordDao() : WordDao

    companion object{
        @Volatile
        private var INSTANCE : TextDatabase?=null
        fun getDatabase(context : Context) : TextDatabase {
            return INSTANCE ?: synchronized(this){

                val instance = Room.databaseBuilder(
                    context.applicationContext, TextDatabase::class.java,"text_database"
                ).fallbackToDestructiveMigration().build()

                INSTANCE = instance
                instance

            }
        }
    }


}