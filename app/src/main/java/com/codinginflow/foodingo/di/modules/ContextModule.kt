package com.codinginflow.foodingo.di.modules

import android.content.Context
import com.codinginflow.foodingo.MainApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ContextModule(val app: MainApp) {

    @Provides
    @Singleton
    fun provideContext(): Context{
        return app
    }
}