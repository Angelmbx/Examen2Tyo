package com.example.examen2tyo.screens.EJ1

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.examen2tyo.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Screen1() {

    var numContadores by rememberSaveable { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name))},
                actions= {
                    if (numContadores != 0) {
                        IconButton(onClick = { numContadores=0 }) {
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
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            if (numContadores==0){

                Ej1TextFieldScreen(/*la creo aquí, se la paso a esta funcion?*/ onUpdateNumContadores= {numContadores=it})
        } else {
                Ej1ContadoresScreen(numContadores)
            }
    }
    }
}


