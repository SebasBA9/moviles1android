/*
package com.sebastian.pdm123.firstPartial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sebastian.pdm123.R
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.*
import androidx.lifecycle.LiveData

@Composable
fun CardsView(navController: NavController, viewModel: CardsViewModel) {

    val card by viewModel.getRandomImage().observeAsState(R.drawable.back)


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = card),
            contentDescription = "",
            modifier = Modifier
                .width(450.dp)
                .height(450.dp)
        )
        Row {
            Button(onClick = {
                viewModel.getBackCards()
            }, modifier = Modifier.padding(8.dp)) {
                Text(text = stringResource(id = R.string.flip))
            }
            Button(onClick = {
                viewModel.getRandomImage()

            }, modifier = Modifier.padding(8.dp)) {
                Text(text = stringResource(id = R.string.random))
            }
        }
    }
}
*/