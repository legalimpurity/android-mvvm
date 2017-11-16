package com.legalimpurity.framework.mvvm.ui.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection

/**
 * Created by rajatkhanna on 14/11/17.
 */

abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel> : AppCompatActivity() {

    private var mViewDataBinding: T? = null
    private var mViewModel: V? = null

    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        performDataBinding()
        performDependencyInjection()
    }

    fun performDataBinding()
    {
        mViewDataBinding = DataBindingUtil.setContentView(this,getLayoutId())
        if(mViewModel == null) mViewModel = getViewModel()
        mViewDataBinding?.let{
            it.setVariable(getBindingVariable(), mViewModel)
            it.executePendingBindings()
        }
    }

    fun performDependencyInjection()
    {
        AndroidInjection.inject(this)
    }

    fun getViewDataBinding() : T {
        return mViewDataBinding!!
    }


    //Functions to be implemented by Activities
    abstract fun getViewModel(): V
    abstract fun getBindingVariable() : Int
    @LayoutRes
    abstract fun getLayoutId() : Int

}