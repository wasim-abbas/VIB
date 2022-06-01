package com.zat.vib.models

data class SimpleMessageModel(
        var message: String?,
        var msg: String?,
        var status: Int?,
        var success:Boolean?,
        var errors: List<String>?

)