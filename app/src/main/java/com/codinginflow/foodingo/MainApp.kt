package com.codinginflow.foodingo

import android.app.Application
import com.codinginflow.foodingo.di.component.AppComponent
import com.codinginflow.foodingo.di.component.DaggerAppComponent
import com.codinginflow.foodingo.di.modules.ContextModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import timber.log.Timber
import javax.inject.Inject

open class MainApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppDI()
        initTimber()
    }

    private fun initAppDI() {
        appComponent = DaggerAppComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()
        appComponent.inject(this)
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    open fun getComponent(): AppComponent {
        return appComponent
    }
}