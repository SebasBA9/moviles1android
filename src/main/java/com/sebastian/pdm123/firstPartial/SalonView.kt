/*
package com.sebastian.pdm123.firstPartial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sebastian.pdm123.R


@Composable
fun SalonView(navController: NavController, viewModel: SalonViewModel) {
    val barbaCountResult by viewModel.getBarbaCount().observeAsState(0)
    val peloCountResult by viewModel.getPeloCount().observeAsState(0)
    val peloBarbaCountResult by viewModel.getPeloBarbaCount().observeAsState(0)
    val totalCostResult by viewModel.getTotalCost().observeAsState(0)


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Row {

            //Se agregan los textos con sus respectivas variables
            Text(text = "$350")

            Spacer(modifier = Modifier.width(125.dp))


            Text(text = "$450")


            Spacer(modifier = Modifier.width(125.dp))

            Text(text = "$900g")


        }
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            //Boton con imagen de barba
            Button(onClick = {
                viewModel.incrementBarba()

            }, modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.barba),
                    contentDescription = "barba",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                )
            }
            //Boton con imagen de corte
            Button(onClick = {
                viewModel.incrementPelo()
            }, modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.corte),
                    contentDescription = "corte",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                )
            }
            //Boton con imagen de corte y barba
            Button(onClick = {
                viewModel.incrementPeloBarba()
            }, modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.corteybarba),
                    contentDescription = "corte y barba",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                )
            }


        }
        Row {

            //Se agregan los textos con sus respectivas variables
            Text(text = "${peloCountResult}")

            Spacer(modifier = Modifier.width(125.dp))


            Text(text = "${barbaCountResult}")


            Spacer(modifier = Modifier.width(125.dp))

            Text(text = "${peloBarbaCountResult}")


        }
        Spacer(modifier = Modifier.height(50.dp))
        Row {
            Text(text = "Total: $$totalCostResult")
        }
    }
}
*/