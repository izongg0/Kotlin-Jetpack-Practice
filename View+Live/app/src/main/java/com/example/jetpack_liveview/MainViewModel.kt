package com.example.jetpack_liveview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var mutableWord = MutableLiveData("")
    val liveWord : LiveData<String>
    get() = mutableWord

    private var randommutableWord = MutableLiveData("")
    val randomliveWord : LiveData<String>
        get() = randommutableWord

    val newData = Transformations.switchMap(liveWord){
        getRandomWordShuffle(it)
    }

    init{
        getNextData()
    }
fun getNextData(){

    val currentWord = testDataList.random()

    val randomWord = currentWord.toCharArray()
    randomWord.shuffle()

    mutableWord.value = currentWord
    randommutableWord.value = String (randomWord)

}

    fun getRandomWordShuffle(word:String):MutableLiveData<String>{

        val liveData = MutableLiveData("")
        val randomTextWord = word.toCharArray()
        randomTextWord.shuffle()
        liveData.value = String(randomTextWord)

        return liveData
    }


}