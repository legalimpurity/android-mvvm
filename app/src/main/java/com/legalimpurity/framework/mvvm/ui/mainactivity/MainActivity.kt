package com.legalimpurity.framework.mvvm.ui.mainactivity

import android.os.Bundle
import com.legalimpurity.framework.mvvm.R
import com.legalimpurity.framework.mvvm.databinding.ActivityMainBinding
import com.legalimpurity.framework.mvvm.ui.base.BaseActivity

/**
 * Created by rajatkhanna on 14/11/17.
 */
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>()
{
    private var mMainViewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getViewModel(): MainViewModel {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBindingVariable(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}