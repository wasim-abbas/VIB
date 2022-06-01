package com.zat.vib.utils.source

import android.content.Context
import android.util.Log
import com.zat.vib.models.ResultWrapper
import retrofit2.HttpException
import java.io.IOException

class DataRepository(private var context: Context) {

    private var apiCaller = RetrofitClient(context).getService()

    private suspend fun <T> safeApiCall(apiCall: suspend () -> T): ResultWrapper<T> {
        try {
            return ResultWrapper.Success(apiCall.invoke())
        } catch (throwable: Throwable) {
            return when (throwable) {
                is IOException -> {
                    Log.d("laksjdcas", throwable.toString())
                    ResultWrapper.NetworkError
                }
                is HttpException -> {
                    Log.d("laksjdcas", throwable.toString())
                    val code = throwable.code()
                    val errorResponse = throwable.toString()

                    ResultWrapper.GenericError(code, errorResponse)
                }
                else -> {
                    Log.d("laksjdcas", throwable.toString())
                    ResultWrapper.GenericError(null, throwable.message)
                }
            }

        }
    }

    //code here for login api

//    suspend fun register(registeRequestModel: RegisteRequestModel):
//            ResultWrapper<Response<RegisterMainModel>> {
//        val email = registeRequestModel.email.toRequestBody(MultipartBody.FORM)
//        val firstName = registeRequestModel.firstname.toRequestBody(MultipartBody.FORM)
//        val lastName = registeRequestModel.lastname.toRequestBody(MultipartBody.FORM)
//        val pass = registeRequestModel.password.toRequestBody(MultipartBody.FORM)
//        val conFirmPass =
//            registeRequestModel.password_confirmation.toRequestBody(MultipartBody.FORM)
//        val device_token = registeRequestModel.device_token.toRequestBody(MultipartBody.FORM)
//
//        var imageRequest: MultipartBody.Part? = null
//        registeRequestModel.image?.let { img ->
//            imageRequest = prepareFilePart(
//                "image", img, 0
//            )
//        }
//        return safeApiCall {
//            apiCaller.register(
//                email,
//                firstName,
//                lastName,
//                pass,
//                conFirmPass,
//                device_token,
//                imageRequest,
//            )
//        }
//
//    }

}