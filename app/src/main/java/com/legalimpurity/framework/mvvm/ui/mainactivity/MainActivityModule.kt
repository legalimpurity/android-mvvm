package com.legalimpurity.framework.mvvm.ui.mainactivity

import dagger.Module
import dagger.Provides

/**
 * Created by rajatkhanna on 19/11/17.
 */
@Module
class MainActivityModule
{
    @Provides
    fun provideMainViewModel() : MainViewModel =  MainViewModel()
}