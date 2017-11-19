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

    private lateinit var mViewDataBinding: T
    private lateinit var mViewModel: V

    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        performDependencyInjection()
        performDataBinding()
    }

    private fun performDataBinding()
    {
        mViewDataBinding = DataBindingUtil.setContentView(this,getLayoutId())
        mViewModel = getViewModel()
        mViewDataBinding.setVariable(getBindingVariable(), mViewModel)
        mViewDataBinding.executePendingBindings()
    }

    private fun performDependencyInjection()
    {
        AndroidInjection.inject(this)
    }

    fun getViewDataBinding() : T = mViewDataBinding


    //Functions to be implemented by Activities
    abstract fun getViewModel(): V
    abstract fun getBindingVariable() : Int
    @LayoutRes
    abstract fun getLayoutId() : Int

}