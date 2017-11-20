package com.legalimpurity.framework.mvvm.ui.mainactivity

import android.arch.lifecycle.ViewModelProvider
import com.legalimpurity.framework.mvvm.di.Factory.ViewModelProviderFactory
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


    @Provides
    fun mainViewModelProvider(mainViewModel: MainViewModel) : ViewModelProvider.Factory = ViewModelProviderFactory<MainViewModel>(mainViewModel)

}