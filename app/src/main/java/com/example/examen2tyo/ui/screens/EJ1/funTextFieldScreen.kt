package com.example.examen2tyo.ui.screens.EJ1

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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen2tyo.ui.StateHolders.ContadoresViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldScreen(onUpdateNumContadores: (Int) -> Unit) {

    val ContadoresViewModel : ContadoresViewModel = viewModel()

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//solucionar paddingvalues
        OutlinedTextField(
            value = ContadoresViewModel.texto,
            onValueChange = { ContadoresViewModel.onTextFieldChange() },
            label={ Text(text = "Numero de contadores")}
        )

        Button(
            onClick = {
            if (ContadoresViewModel.texto.isNotBlank())
                onUpdateNumContadores(ContadoresViewModel.texto.toIntOrNull()?:0)
                ContadoresViewModel.texto==""
            }) {
            Text(text = "Mostrar contadores")
        }

    }
}
    