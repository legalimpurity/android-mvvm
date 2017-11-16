package com.legalimpurity.framework.mvvm.ui.mainactivity

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
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
    private var mMainViewModel: MainViewModel? = null
    private var mActivityMainBinding: ActivityMainBinding? = null


    @Inject
    lateinit var mViewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityMainBinding = getViewDataBinding()
    }

    override fun getViewModel(): MainViewModel {
        mMainViewModel = ViewModelProviders.of(this, mViewModelFactory).get(MainViewModel::class.java)
        return mMainViewModel!!
    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

}