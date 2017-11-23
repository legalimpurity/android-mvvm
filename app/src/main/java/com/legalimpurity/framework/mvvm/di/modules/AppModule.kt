package com.legalimpurity.framework.mvvm.di.modules

import android.app.Application
import android.content.Context
import com.legalimpurity.framework.mvvm.data.AppDataManager
import com.legalimpurity.framework.mvvm.data.DataManager
import com.legalimpurity.framework.mvvm.data.sample.SampleDataHelper
import com.legalimpurity.framework.mvvm.data.sample.SampleHelper
import com.legalimpurity.framework.mvvm.util.rx.AppSchedulerProvider
import com.legalimpurity.framework.mvvm.util.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by rajatkhanna on 12/11/17.
 */

@Module
class AppModule() {

    @Singleton
    @Provides
    fun provideDataManager(appDataManager: AppDataManager):DataManager = appDataManager

    @Singleton
    @Provides
    fun provideScheduleProvider():SchedulerProvider = AppSchedulerProvider()

    @Singleton
    @Provides
    fun provideSampleHelper(sampleDataRepository: SampleDataHelper): SampleHelper = sampleDataRepository

    @Singleton
    @Provides
    fun provideContext(app: Application):Context = app
}