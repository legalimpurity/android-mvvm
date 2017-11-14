package com.legalimpurity.framework.mvvm.ui.base

import android.arch.lifecycle.ViewModel

/**
 * Created by rajatkhanna on 14/11/17.
 */

abstract class BaseViewModel : ViewModel()
{
    override fun onCleared() {
        super.onCleared()
    }
}