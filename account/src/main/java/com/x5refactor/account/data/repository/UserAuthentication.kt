package com.x5refactor.account.data.repository

import io.reactivex.Single

interface UserAuthentication {

    suspend fun getUserCredentials(): Single<UserAuthentication>

}