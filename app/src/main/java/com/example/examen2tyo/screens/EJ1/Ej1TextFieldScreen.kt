package com.example.examen2tyo.screens.EJ1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ej1TextFieldScreen(onUpdateNumContadores: (Int) -> Unit) {

    var texto by rememberSaveable { mutableStateOf("") }


    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//solucionar paddingvalues
        OutlinedTextField(
            value = texto,
            onValueChange = {texto = it},
            label={ Text(text = "Numero de contadores")}
        )

        Button(
            onClick = {
            if (texto.isNotBlank())
                onUpdateNumContadores(texto.toIntOrNull()?:0)
                texto=""
            }) {
            Text(text = "Mostrar contadores")
        }

    }
}
    