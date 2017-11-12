package com.legalimpurity.framework.mvvm.di.components

import com.legalimpurity.framework.mvvm.MVVMApp
import com.legalimpurity.framework.mvvm.di.modules.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by rajatkhanna on 12/11/17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: MVVMApp)
}