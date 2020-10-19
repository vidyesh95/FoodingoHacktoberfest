package com.codinginflow.foodingo.di.modules

import com.codinginflow.foodingo.ui.entertain.EntertainFragment
import com.codinginflow.foodingo.ui.explore.ExploreFragment
import com.codinginflow.foodingo.ui.goout.GoOutFragment
import com.codinginflow.foodingo.ui.order.OrderFragment
import com.codinginflow.foodingo.ui.spaces.SpacesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentInjectionModule {

    @ContributesAndroidInjector
    abstract fun contributesEntertainFragment(): EntertainFragment

    @ContributesAndroidInjector
    abstract fun contributesExploreFragment(): ExploreFragment

    @ContributesAndroidInjector
    abstract fun contributesGoOutFragment(): GoOutFragment

    @ContributesAndroidInjector
    abstract fun contributesOrderFragment(): OrderFragment

    @ContributesAndroidInjector
    abstract fun contributesSpacesFragment(): SpacesFragment
}