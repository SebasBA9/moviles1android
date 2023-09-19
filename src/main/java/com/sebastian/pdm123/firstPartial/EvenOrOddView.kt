/*
package com.sebastian.pdm123.firstPartial

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sebastian.pdm123.R

@Composable
fun EvenOddView(navController: NavController, viewModel: EvenOrOddViewModel) {
    // Esta variable va a almacenar el valor de la caja de texto

    var txtNumber by remember { mutableStateOf("") }
    val evenOddState by viewModel.getResultStatus().observeAsState(R.string.number)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (viewModel.getBooleanState().value == true) {
            ComposeLottieAnimationEven(
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
            )
        } else {
            ComposeLottieAnimationOdd(modifier = Modifier
                .width(150.dp)
                .height(150.dp))
        }
        Text(text = stringResource(id = R.string.even_or_odd))

        TextField(
            value = txtNumber,
            onValueChange = {
                txtNumber = it

                // Verificar si el valor es un número entero o no

                if (txtNumber != "") {
                    viewModel.calculateEvenOdd(txtNumber.toInt())
                    viewModel.getBooleanState()
                }
//                else if (newValue.isEmpty()) {
//                    // Mostrar un mensaje si el TextField está vacío
//                    viewModel.calculateEvenOdd()
//                } else {
//                    // Mostrar un mensaje de error si no es un número entero
//                    viewModel.calculateEvenOdd()
//                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        // Mostrar mensajes en función del estado

        Text(text = stringResource(id = evenOddState))

    }
}
*/