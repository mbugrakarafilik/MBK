package com.example.mbk

import kotlinx.coroutines.flow.Flow

interface UserPreference {

    /**
     * returns user name flow
     * */
    fun userName(): Flow<String>

    /**
     * saves user name in data store
     * */
    suspend fun saveUserName(name: String)

}