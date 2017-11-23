package com.legalimpurity.framework.mvvm.util.rx

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by rajatkhanna on 20/11/17.
 */

class AppSchedulerProvider() : SchedulerProvider
{
    override fun ui(): Scheduler = AndroidSchedulers.mainThread()

    override fun computation(): Scheduler = Schedulers.computation()

    override fun io(): Scheduler = Schedulers.io()

}