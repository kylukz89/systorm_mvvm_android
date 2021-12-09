package com.x5refactor.account.data.model

import com.google.gson.annotations.SerializedName

data class UserAuthentication(
    @SerializedName("enterprise")
    val enterprise: String,
    @SerializedName("is_adm")
    val isAdm: Boolean,
    @SerializedName("pass")
    val pass: String,
    @SerializedName("user")
    val user: String
)