package com.codinginflow.foodingo.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codinginflow.foodingo.di.annotation.ViewModelKey
import com.codinginflow.foodingo.di.factory.ViewModelFactory
import com.codinginflow.foodingo.ui.entertain.EntertainViewModel
import com.codinginflow.foodingo.ui.explore.ExploreViewModel
import com.codinginflow.foodingo.ui.goout.GoOutViewModel
import com.codinginflow.foodingo.ui.order.OrderViewModel
import com.codinginflow.foodingo.ui.spaces.SpacesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(EntertainViewModel::class)
    abstract fun provideEntertainViewModel(viewModel: EntertainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ExploreViewModel::class)
    abstract fun provideExploreViewModel(viewModel: ExploreViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GoOutViewModel::class)
    abstract fun provideGoOutViewModel(viewModel: GoOutViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(OrderViewModel::class)
    abstract fun provideOrderViewModel(viewModel: OrderViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SpacesViewModel::class)
    abstract fun provideSpacesViewModel(viewModel: SpacesViewModel): ViewModel

}