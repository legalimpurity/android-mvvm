package com.legalimpurity.framework.mvvm.data

import android.content.Context
import com.legalimpurity.framework.mvvm.data.sample.SampleHelper
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rajatkhanna on 21/11/17.
 */
@Singleton
class AppDataManager @Inject constructor(_ctx : Context, sampleHelper: SampleHelper): DataManager
{
    private var _ctx : Context? = null
    private var sampleHelper: SampleHelper? = null

    init
    {
        this._ctx = _ctx
        this.sampleHelper = sampleHelper
    }

    override fun getSampleData(): Observable<String> = sampleHelper!!.getSampleData()

}