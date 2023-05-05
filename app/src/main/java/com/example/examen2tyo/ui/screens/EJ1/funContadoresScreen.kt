package com.example.examen2tyo.ui.screens.EJ1

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
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen2tyo.ui.StateHolders.ContadoresViewModel


@Composable
fun ContadoresScreen(
        contador: Int,
        onDecreaseCounter: () -> Unit,
        onIncreaseCounter: () -> Unit,
        modifier: Modifier = Modifier
) {

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,

            ){
                Button(onClick = {onDecreaseCounter()}) {
                    Text(text = "Decrementar")
                }
                Text(text = "$contador")
                Button(onClick = {onIncreaseCounter()}) {
                    Text(text = "Incrementar")
                }
            }


    }

