package com.legalimpurity.framework.mvvm.di.Factory

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

/**
 * Created by rajatkhanna on 19/11/17.
 */

class ViewModelProviderFactory<V: Any>(private val viewModel: V) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(viewModel::class.java)) {
                return viewModel as T
            }
        throw IllegalArgumentException("Unknown class name")
    }

}