package com.legalimpurity.framework.mvvm.data.interactors

import com.legalimpurity.framework.mvvm.data.model.SampleDataRepo
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by rajatkhanna on 19/11/17.
 */
class LoadSampleUseCase()
{
    lateinit var sampleDataRepo: SampleDataRepo

    @Inject
    fun LoadSampleUseCase(sampleDataRepo: SampleDataRepo)
    {
        this.sampleDataRepo = sampleDataRepo
    }

    fun execute() : Single<String> = sampleDataRepo.getSampleData()
}