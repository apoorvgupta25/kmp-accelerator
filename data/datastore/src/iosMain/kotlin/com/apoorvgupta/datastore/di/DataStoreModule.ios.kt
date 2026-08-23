package com.apoorvgupta.datastore.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.apoorvgupta.datastore.IosDataStore
import org.koin.dsl.module

/**
 * Platform data store module
 *
 * @author Apoorv Gupta
 */
internal actual val platformDataStoreModule = module {
    single<DataStore<Preferences>> { IosDataStore().getDataStore() }
}
