package com.zat.vib.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

open class BaseViewModel(application: Application):AndroidViewModel(application) {
    var errorLiveData =MutableLiveData<String>()
}