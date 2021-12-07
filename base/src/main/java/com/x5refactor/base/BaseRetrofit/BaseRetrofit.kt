package com.x5refactor.base.BaseRetrofit

import retrofit2.http.GET

interface BaseRetrofit {

    @GET("")
    suspend fun getAuth()

}