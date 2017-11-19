package com.legalimpurity.framework.mvvm.di.modules

import com.legalimpurity.framework.mvvm.MVVMApp
import dagger.Module
import dagger.Provides

/**
 * Created by rajatkhanna on 12/11/17.
 */

@Module
class AppModule(val app: MVVMApp) {

    @Provides
    fun provideApp(): MVVMApp = app

    
}