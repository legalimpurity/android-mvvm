package com.legalimpurity.framework.mvvm.ui.mainactivity

import android.os.Bundle
import com.legalimpurity.framework.mvvm.BR
import com.legalimpurity.framework.mvvm.R
import com.legalimpurity.framework.mvvm.databinding.ActivityMainBinding
import com.legalimpurity.framework.mvvm.ui.base.BaseActivity
import javax.inject.Inject

/**
 * Created by rajatkhanna on 14/11/17.
 */
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>()
{
    @Inject lateinit var mMainViewModel: MainViewModel

    private var mActivityMainBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityMainBinding = getViewDataBinding()

        mMainViewModel.loadSampleData()
    }

    //Functions to be implemented by every Activity
    override fun getViewModel(): MainViewModel {
        return mMainViewModel
    }

    override fun getBindingVariable() = BR.viewModel

    override fun getLayoutId() = R.layout.activity_main

}