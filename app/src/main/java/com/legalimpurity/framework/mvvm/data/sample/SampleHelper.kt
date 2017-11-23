package com.legalimpurity.framework.mvvm.data.sample

import io.reactivex.Observable


/**
 * Created by rajatkhanna on 21/11/17.
 */
interface SampleHelper
{
    fun getSampleData() : Observable<String>
}