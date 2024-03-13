package com.example.mbk.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import com.example.mbk.UserPreference
import com.example.mbk.local.DataStoreManager.Companion.KEY_USER_NAME
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map

class UserDataStore  constructor(
    private val dataStore: DataStore<Preferences>
): UserPreference {


    override fun userName(): Flow<String> {
        return dataStore.data
            .catch {
                emit(emptyPreferences())
            }
            .map { preference ->
                preference[KEY_USER_NAME] ?: ""
            }
    }

    override suspend fun saveUserName(name: String) {
        dataStore.edit { preference ->
            preference[KEY_USER_NAME] = name
        }
    }

}