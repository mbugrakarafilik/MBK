package com.example.mbk.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.datastore: DataStore<Preferences> by preferencesDataStore("products")


class DataStoreManager(private val context: Context) {

    private val myDatastore: DataStore<Preferences> = context.datastore
    private val dataStore = context.datastore

    companion object {
        val PRODUCT_NAME = stringPreferencesKey("PRODUCT_NAME")
        val PRODUCT_PRICE = stringPreferencesKey("PRODUCT_PRICE")
        val IS_SOLD = booleanPreferencesKey("IS_SOLD")
        val KEY_USER_NAME = stringPreferencesKey("KEY_USER_NAME")
    }

    suspend fun storeProductData(
        productName: String,
        productPrice: String,
        isSold: Boolean
    ) {
        myDatastore.edit { preferences ->
            preferences[PRODUCT_NAME] = productName
            preferences[PRODUCT_PRICE] = productPrice
            preferences[IS_SOLD] = isSold
        }
    }

    val productNameFlow: Flow<String> = myDatastore.data.map { value ->
        value[PRODUCT_NAME] ?: ""
    }

    val productPriceFlow: Flow<String> = myDatastore.data.map {
        it[PRODUCT_PRICE] ?: ""
    }

    val productIsSoldFlow: Flow<Boolean> = myDatastore.data.map {
        it[IS_SOLD] ?: false
    }
}


