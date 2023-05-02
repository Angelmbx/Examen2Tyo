package com.example.examen2tyo.screens.EJ1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter


@Composable
fun Ej1ContadoresScreen(numContadores: Int) {

    var contador by rememberSaveable { mutableStateOf(0)}


    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        for (i in 0 until numContadores) {

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Button(onClick = { contador--}) {
                    Text(text = "Decrementar")
                }
                Text(text = "$contador")
                Button(onClick = { contador++}) {
                    Text(text = "Incrementar")
                }
            }

        }
    }
}
