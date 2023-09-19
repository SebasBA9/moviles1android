/*
package com.sebastian.pdm123.firstPartial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sebastian.pdm123.R

class CardsViewModel : ViewModel() {

    val cardImageResId = MutableLiveData(R.drawable.back)

    fun getBackCards(): MutableLiveData<Int> = cardImageResId

    fun getRandomImage(){
       val RandomNumber = (1..13).random()
       when(RandomNumber){
           1 -> cardImageResId.postValue(R.drawable.h01)
           2 -> cardImageResId.postValue(R.drawable.h02)
           3 -> cardImageResId.postValue(R.drawable.h03)
           4 -> cardImageResId.postValue(R.drawable.h04)
           5 -> cardImageResId.postValue(R.drawable.h05)
           6 -> cardImageResId.postValue(R.drawable.h06)
           7 -> cardImageResId.postValue(R.drawable.h07)
           8 -> cardImageResId.postValue(R.drawable.h08)
           9 -> cardImageResId.postValue(R.drawable.h09)
           10 -> cardImageResId.postValue(R.drawable.h10)
           11 -> cardImageResId.postValue(R.drawable.joto)
           12 -> cardImageResId.postValue(R.drawable.queen)
           13 -> cardImageResId.postValue(R.drawable.king)
       }
    }
}
 */