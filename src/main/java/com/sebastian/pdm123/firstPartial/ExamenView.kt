package com.sebastian.pdm123.firstPartial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sebastian.pdm123.R


@Composable
fun ExamenView(navController:NavController, viewModel:ExamenViewModel){
    
        var produccionTotal by remember { mutableStateOf(0) }
        var produccionActual by remember { mutableStateOf(0) }
        var porcentaje by remember { mutableStateOf(0) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.RejasDeManzanas),
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Text(text = "Produccion Total", fontSize = 20.sp)
                BasicTextField(
                    value = produccionTotal.toString(),
                    onValueChange = {
                        produccionTotal = it.toIntOrNull() ?: 0
                        viewModel.handleProduccionTotal(produccionTotal)
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                )
                Button(
                    onClick = {
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.manzana),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Text(text = "Produccion Actual", fontSize = 20.sp)
                BasicTextField(
                    value = produccionActual.toString(),
                    onValueChange = {
                        produccionActual = it.toIntOrNull() ?: 0
                        viewModel.handleBonus(produccionActual)
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.manzana),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                for (bonus in listOf(5, 15, 30, 50)) {
                    Button(
                        onClick = {
                            viewModel.handleBonus(bonus)
                        },
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    ) {
                        Text(text = "+$bonus")
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Porcentaje: $porcentaje%",
                fontSize = 20.sp,
                color = Color.Gray
            )
            Button(
                onClick = {
                    viewModel.calculatePorcentaje()
                    porcentaje = viewModel.porcentaje
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Calcular")
            }
        }
    }
