package com.legalimpurity.framework.mvvm.util.rx

import io.reactivex.Scheduler

/**
 * Created by rajatkhanna on 20/11/17.
 */

interface SchedulerProvider
{
    fun ui(): Scheduler
    fun computation(): Scheduler
    fun io(): Scheduler
}