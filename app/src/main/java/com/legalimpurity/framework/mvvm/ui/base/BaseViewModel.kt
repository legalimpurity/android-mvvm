package com.legalimpurity.framework.mvvm.ui.base

import android.arch.lifecycle.ViewModel
import com.legalimpurity.framework.mvvm.data.DataManager
import com.legalimpurity.framework.mvvm.util.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by rajatkhanna on 14/11/17.
 */

abstract class BaseViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) : ViewModel()
{

    private val compositeDisposable = CompositeDisposable()
    private var schedulerProvider:SchedulerProvider? = null
    private var dataManager: DataManager? = null

    init
    {
        this.dataManager = dataManager
        this.schedulerProvider = schedulerProvider
    }



    fun getCompositeDisposable() = compositeDisposable
    fun getScheduleProvider() = schedulerProvider!!
    fun getDataManager() = dataManager!!


}