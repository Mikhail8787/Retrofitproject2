package com.example.retrofitproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel(){
    val token = MutableLiveData<String>()
}