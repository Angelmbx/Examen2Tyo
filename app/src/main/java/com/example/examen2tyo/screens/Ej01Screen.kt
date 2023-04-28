package com.example.examen2tyo.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Screen1() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Contadores")
                }
            )
        }
    ) {
        Box(Modifier.fillMaxSize()) {
            Text(
                text = "Contenido",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }

}