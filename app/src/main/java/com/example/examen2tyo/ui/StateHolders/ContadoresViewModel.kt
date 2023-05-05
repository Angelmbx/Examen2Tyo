package com.example.examen2tyo.ui.StateHolders

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ContadoresViewModel: ViewModel() {

    private var _numContadores by mutableStateOf(0)
    val numContadores get() = _numContadores

    private var _texto by  mutableStateOf("")
    val texto get() = _texto

    private var _contador by mutableStateOf(0)
    val contador get() = _contador

    fun onTextFieldChange(newText : String) {
        _texto = newText
    }

    fun onUpdateNumContadores(newNumber : Int) { //puede estar aqui el error?
        _numContadores = newNumber
    }

    fun onIncreaseCounter (){
        _contador++
    }

    fun onDecreaseCounter(){
        _contador--
    }

    fun onRefreshButton(){
        _numContadores = 0
        _texto=""
    }
}