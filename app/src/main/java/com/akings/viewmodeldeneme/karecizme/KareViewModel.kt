package com.akings.viewmodeldeneme.karecizme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class KareViewModel:ViewModel() {

    private val _name = MutableStateFlow("")
    val name = _name.asStateFlow()

    private val _numx = MutableStateFlow(1f)
    val numx = _numx.asStateFlow()

    private val _numy = MutableStateFlow(1f)
    val numy = _numy.asStateFlow()

    fun setName(name: String) {
        _name.value = name
    }

    fun setNumx(numx: String) {
        _numx.value = numx.toFloat()
    }

    fun setNumy(numy: String) {
        _numy.value = numy.toFloat()
    }






}