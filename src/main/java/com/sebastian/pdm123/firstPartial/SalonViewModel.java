/*
package com.sebastian.pdm123.firstPartial;

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pdm123.R

class SalonViewModel: ViewModel() {
    //SE CREAN LAS CONSTANTES INDIVIDUALES PARA CADA OPCION DE CORTE
private val barbaCount = MutableLiveData(0)
private val peloCount = MutableLiveData(0)
private val peloBarbaCount = MutableLiveData(0)
    //SECREA UNA CONSTANTE QUE ALMACENARA EL TOTAL FINAL
private val totalCost = MutableLiveData(0)
    //SE CREEAN LAS FUNCIONES QUE REGRESARAN EL COSTO DE CADA CORTE
        fun getPeloCount(): LiveData<Int> = peloCount
        fun getBarbaCount(): LiveData<Int> = barbaCount
        fun getPeloBarbaCount(): LiveData<Int> = peloBarbaCount
        fun getTotalCost(): LiveData<Int> = totalCost

        fun incrementPelo() {
        val currentCount = peloCount.value ?: 0
        peloCount.value = currentCount + 1
        calculateTotalCost()
        }

        fun incrementBarba() {
        val currentCount = barbaCount.value ?: 0
        barbaCount.value = currentCount + 1
        calculateTotalCost()
        }

        fun incrementPeloBarba() {
        val currentCount = peloBarbaCount.value ?: 0
        peloBarbaCount.value = currentCount + 1
        calculateTotalCost()
        }

private fun calculateTotalCost() {
        val peloCost = (peloCount.value ?: 0) * 450
        val barbaCost = (barbaCount.value ?: 0) * 350
        val peloBarbaCost = (peloBarbaCount.value ?: 0) * 900

        // Sumar los costos individuales para obtener el total
        val total = peloCost + barbaCost + peloBarbaCost
        totalCost.value = total
        }

}
*/