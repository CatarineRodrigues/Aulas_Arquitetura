package br.com.zup.movieflix.register.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.movieflix.register.model.RegisterModel
import br.com.zup.movieflix.register.repository.RegisterRepository

class RegisterViewModel() : ViewModel() {
    private val repository = RegisterRepository()
    private val _response: MutableLiveData<List<RegisterModel>> = MutableLiveData()
    val response: LiveData<List<RegisterModel>> = _response


}