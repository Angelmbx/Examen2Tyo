package com.example.examen2tyo.ui.screens.EJ1

import android.annotation.SuppressLint
import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen2tyo.ui.StateHolders.ContadoresViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextoYBoton(
    text: String,
    onValueChangeTextField: (String) -> Unit,
    onClick: (String) -> Unit,
) {


    val context = LocalContext.current

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = text,
            onValueChange = {onValueChangeTextField(it)},
            label = { Text(text = "Numero de contadores") }
        )

        Button(
            onClick = {onClick(text)}) {
            Text(text = "Mostrar contadores")
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldScreen(
    texto: String,
    onUpdateNumContadores: (Int) -> Unit,
    onTextFieldChange: (String) -> Unit,
    modifier: Modifier = Modifier) {


    val context = LocalContext.current

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = texto,
            onValueChange = { onTextFieldChange(it) },
            label = { Text(text = "Numero de contadores") }
        )

        Button(
            onClick = {
                if (texto.isNotBlank()) {
                    onUpdateNumContadores(texto.toIntOrNull() ?: 0)
                    onTextFieldChange("")
                } else
                    Toast.makeText(context, " Debes introducir un número", Toast.LENGTH_SHORT).show()
            }) {
            Text(text = "Mostrar contadores")
        }

    }
}