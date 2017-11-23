package com.legalimpurity.framework.mvvm.ui.mainactivity

import android.arch.lifecycle.ViewModelProvider
import com.legalimpurity.framework.mvvm.data.DataManager
import com.legalimpurity.framework.mvvm.di.Factory.ViewModelProviderFactory
import com.legalimpurity.framework.mvvm.util.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

/**
 * Created by rajatkhanna on 19/11/17.
 */
@Module
class MainActivityModule
{
    @Provides
    fun provideMainViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) : MainViewModel =  MainViewModel(dataManager,schedulerProvider)


    @Provides
    fun mainViewModelProvider(mainViewModel: MainViewModel) : ViewModelProvider.Factory = ViewModelProviderFactory<MainViewModel>(mainViewModel)

}