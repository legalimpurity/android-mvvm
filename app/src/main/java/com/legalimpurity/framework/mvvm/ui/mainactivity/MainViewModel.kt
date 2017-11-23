package com.legalimpurity.framework.mvvm.ui.mainactivity

import android.databinding.ObservableField
import com.legalimpurity.framework.mvvm.data.DataManager
import com.legalimpurity.framework.mvvm.ui.base.BaseViewModel
import com.legalimpurity.framework.mvvm.util.rx.SchedulerProvider

/**
 * Created by rajatkhanna on 14/11/17.
 */
class MainViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) : BaseViewModel(dataManager,schedulerProvider)
{

    private var sampleData: ObservableField<String> = ObservableField<String>()
    fun getSampleData() : ObservableField<String> = sampleData

    fun loadSampleData()
    {
        getCompositeDisposable().add(
            getDataManager().getSampleData()
                .subscribeOn(getScheduleProvider().io())
                .observeOn(getScheduleProvider().ui())
                .subscribe(
                        { sample -> sampleData.set(sample)},
                        { throwable -> sampleData.set("ERROR")}
                )
        )
    }
}