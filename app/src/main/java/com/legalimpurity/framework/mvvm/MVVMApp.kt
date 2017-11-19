package com.legalimpurity.framework.mvvm

import android.app.Activity
import android.app.Application
import com.legalimpurity.framework.mvvm.di.components.AppComponent
import com.legalimpurity.framework.mvvm.di.components.DaggerAppComponent
import com.legalimpurity.framework.mvvm.di.modules.AppModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


/**
 * Created by rajatkhanna on 12/11/17.
 */

class MVVMApp : Application(), HasActivityInjector
{
    @Inject lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

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

    override fun activityInjector(): AndroidInjector<Activity> = activityDispatchingAndroidInjector

    fun getComponent() : AppComponent = appComponent
}