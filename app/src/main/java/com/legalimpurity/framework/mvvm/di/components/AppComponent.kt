package com.legalimpurity.framework.mvvm.di.components

import android.app.Application
import com.legalimpurity.framework.mvvm.MVVMApp
import com.legalimpurity.framework.mvvm.di.builder.BuildersModule
import com.legalimpurity.framework.mvvm.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by rajatkhanna on 12/11/17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, BuildersModule::class, AndroidSupportInjectionModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        fun application(application: Application) : Builder
        fun build() : AppComponent
    }

    fun inject(app: MVVMApp)
}