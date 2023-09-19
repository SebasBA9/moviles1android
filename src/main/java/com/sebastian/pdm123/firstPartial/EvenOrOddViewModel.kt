/*
package com.sebastian.pdm123.firstPartial

import androidx.lifecycle.MutableLiveData
import com.sebastian.pdm123.R

class EvenOrOddViewModel : viewModel(){
        var evenOrODDStatus = MutableLiveData<Int>()
        var showFirstImage = MutableLiveData<Boolean>(false)
        fun getResultStatus(): MutableLiveData<Int> = evenOrODDStatus
        fun getBooleanState(): MutableLiveData<Boolean> = showFirstImage

        fun calculateEvenOdd(number: Int) {
            if (number != 0) {
                if (number % 2 == 0) {
                    evenOrODDStatus.postValue(R.string.even)
                    showFirstImage.postValue(true)
                } else if (number % 2 == 1) {
                    evenOrODDStatus.postValue(R.string.odd)
                    showFirstImage.postValue(false)

                }
            }
            else {
                evenOrODDStatus.postValue(R.string.zero)
            }
        }
    }
}
*/