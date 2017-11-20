package com.legalimpurity.framework.mvvm.data.model

import io.reactivex.Single

/**
 * Created by rajatkhanna on 19/11/17.
 */
class SampleDataRepo()
{
    fun getSampleData(): Single<String> = Single.just("Hello this is sample data.")
}