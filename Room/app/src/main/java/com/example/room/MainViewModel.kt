package com.example.room

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.room.db.TextDatabase
import com.example.room.entity.TextEntity
import com.example.room.entity.WordEntity
import com.example.room.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(application: Application) :AndroidViewModel(application){

    val context = getApplication<Application>().applicationContext
    val db = TextDatabase.getDatabase(context)

    private var _textList = MutableLiveData<List<TextEntity>>()
    val textList : LiveData<List<TextEntity>>
    get() = _textList

    private var _wordList = MutableLiveData<List<WordEntity>>()
    val wordList : LiveData<List<WordEntity>>
        get() = _wordList

    val repository = Repository(context) // 밑에 내용 이걸로 바꿔주면 되는데

    fun getData() = viewModelScope.launch(Dispatchers.IO) {
        Log.d("apdlsqb",db.textDao().getAllData().toString() )
        Log.d("apdlsqb",db.wordDao().getAllData().toString())

        //에러
//        _textList.value = db.textDao().getAllData()
//        _wordList.value = db.wordDao().getAllData()

        //레포지 쓰기전
//        _textList.postValue(db.textDao().getAllData())
//        _wordList.postValue(db.wordDao().getAllData())


        _textList.postValue(repository.getTextList())
        _wordList.postValue(repository.getWordList())

    }
    fun insertData(text : String) = viewModelScope.launch(Dispatchers.IO) {
        //레포지 쓰기전
//        db.textDao().insert(TextEntity(0,text))
//        db.wordDao().insert(WordEntity(0,text))
        repository.insertTextData(text)
        repository.insertWordData(text)
    }
    fun removeData() = viewModelScope.launch(Dispatchers.IO) {
        //레포지 쓰기전
//        db.textDao().deleteAllData()
//        db.wordDao().deleteAllData()
        repository.deleteTextData()
        repository.deleteWordData()
    }





}