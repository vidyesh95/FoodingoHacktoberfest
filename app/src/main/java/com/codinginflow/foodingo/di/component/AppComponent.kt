package com.codinginflow.foodingo.di.component

import com.codinginflow.foodingo.MainApp
import com.codinginflow.foodingo.di.modules.ActivityInjectionModule
import com.codinginflow.foodingo.di.modules.ContextModule
import com.codinginflow.foodingo.di.modules.FragmentInjectionModule
import com.codinginflow.foodingo.di.modules.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityInjectionModule::class,
        FragmentInjectionModule::class,
        ContextModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {
    fun inject(instance: MainApp)
}