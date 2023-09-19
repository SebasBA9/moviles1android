package com.sebastian.pdm123.firstPartial

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ExamenViewModel: ViewModel(){

    // VARIABLES INICIALIZADAS EN 0
    var produccionTotal by mutableStateOf(0)
        var produccionActual by mutableStateOf(0)
        var porcentaje by mutableStateOf(0)
    //FUNCION QUE REGRESA EL VALOR TOTAL
        fun handleProduccionTotal(value: Int) {
            produccionTotal = value
        }
    //FUNCION QUE SUMA EL VALOR DE CADA BOTON
        fun handleBonus(bonus: Int) {
            produccionActual += bonus
        }
    //FUNCION QUE CALCULA EL PORECENTAJE
        fun calculatePorcentaje(produccionActual: Int) {
            if (produccionTotal > 0) {
                porcentaje = (produccionActual * 100) / produccionTotal
            } else {
                porcentaje = 0
            }
        }
    }

}