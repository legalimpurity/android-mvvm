package com.legalimpurity.framework.mvvm

import android.app.Application
import com.legalimpurity.framework.mvvm.di.components.AppComponent
import com.legalimpurity.framework.mvvm.di.components.DaggerAppComponent
import com.legalimpurity.framework.mvvm.di.modules.AppModule

/**
 * Created by rajatkhanna on 12/11/17.
 */

class MVVMApp : Application()
{
    // Initialized by Lambda the first time it is supposed to bu used.
    val appComponent: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()

    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }

    fun appComponent() : AppComponent = appComponent
}