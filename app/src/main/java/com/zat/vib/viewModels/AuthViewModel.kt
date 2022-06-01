package com.zat.vib.viewModels

import android.app.Application
import com.zat.vib.utils.source.DataRepository

class AuthViewModel(var dataRepository: DataRepository, application: Application) :
    BaseViewModel(application) {



//
//
//    fun registerUser(registeRequestModel: RegisteRequestModel) {
//        viewModelScope.launch {
//            when (val apiResponse = dataRepository.register(registeRequestModel)) {
//                is ResultWrapper.NetworkError -> errorLiveData.postValue("Network Error")
//                is ResultWrapper.GenericError -> errorLiveData.postValue(apiResponse.error)
//                is ResultWrapper.Success -> {
//                    if (apiResponse.value.code() == 401) {
//                        errorLiveData.postValue("Unauthenticated User")
//                    } else {
//                        if (apiResponse.value.body()?.errors == null) {
//                            registerUserLiveData.postValue(apiResponse.value.body())
//                        } else {
//                            errorLiveData.postValue(apiResponse.value.body()!!.errors?.get(0))
//                        }
//                    }
//                }
//            }
//        }
//    }


}