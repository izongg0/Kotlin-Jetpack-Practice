package com.example.room.repository

import android.content.Context
import com.example.room.db.TextDatabase
import com.example.room.entity.TextEntity
import com.example.room.entity.WordEntity

class Repository(context : Context) {
    val db = TextDatabase.getDatabase(context)

    fun getTextList() = db.textDao().getAllData()

    fun getWordList() = db.wordDao().getAllData()

    fun insertTextData(text:String) = db.textDao().insert(TextEntity(0,text))

    fun insertWordData(text:String) = db.wordDao().insert(WordEntity(0,text))

    fun deleteTextData() = db.textDao().deleteAllData()

    fun deleteWordData() = db.wordDao().deleteAllData()




}