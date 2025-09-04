package org.example.composemp.di

import org.example.composemp.dependencies.DbClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)
}