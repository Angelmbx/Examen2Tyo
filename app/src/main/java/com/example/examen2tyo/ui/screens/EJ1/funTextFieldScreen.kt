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


@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldScreen() {

    val ContadoresViewModel : ContadoresViewModel = viewModel()
    val context = LocalContext.current

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//solucionar paddingvalues
        OutlinedTextField(
            value = ContadoresViewModel.texto,
            onValueChange = { ContadoresViewModel.onTextFieldChange(it) },
            label={ Text(text = "Numero de contadores")}
        )

        Button(
            onClick = {
            if (ContadoresViewModel.texto.isNotBlank()) {
                ContadoresViewModel.onUpdateNumContadores(ContadoresViewModel.texto.toIntOrNull() ?: 0) //error?
                ContadoresViewModel.texto == ""
            } else
                Toast.makeText(context,"Debes introducir un número",Toast.LENGTH_SHORT).show()
            }) {
            Text(text = "Mostrar contadores")
        }

    }
}