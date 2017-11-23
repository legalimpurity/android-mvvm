package com.legalimpurity.framework.mvvm.data.sample

import io.reactivex.Observable
import io.reactivex.Single

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rajatkhanna on 21/11/17.
 */
@Singleton
class SampleDataHelper @Inject constructor() : SampleHelper
{
    override fun getSampleData(): Observable<String>  = Single.just("You are getting this data from Sample Data Helper!").toObservable()
}