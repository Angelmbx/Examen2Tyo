package com.example.examen2tyo.ui.screens.EJ1

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen2tyo.R
import com.example.examen2tyo.ui.StateHolders.ContadoresViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Screen1() {

    val ContadoresViewModel : ContadoresViewModel = viewModel()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name))},
                actions= {
                    if (ContadoresViewModel.numContadores != 0) {
                        IconButton(onClick = { ContadoresViewModel.numContadores==0 }) {
                            Icon(
                                imageVector = Icons.Filled.Refresh,
                                contentDescription = ""
                            )
                        }
                    }
                })
        }
    )
    {padding->

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = padding),
        ) {
            if (ContadoresViewModel.numContadores==0){

                TextFieldScreen( onUpdateNumContadores= {ContadoresViewModel.numContadores==it})
        } else {
            repeat(ContadoresViewModel.numContadores) {
                ContadoresScreen()
            }

            }
    }
    }
}


