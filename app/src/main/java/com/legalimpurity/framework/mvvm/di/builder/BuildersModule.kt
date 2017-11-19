package com.legalimpurity.framework.mvvm.di.builder

import com.legalimpurity.framework.mvvm.ui.mainactivity.MainActivity
import com.legalimpurity.framework.mvvm.ui.mainactivity.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by rajatkhanna on 19/11/17.
 */
@Module
abstract class BuildersModule
{
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity() : MainActivity
}