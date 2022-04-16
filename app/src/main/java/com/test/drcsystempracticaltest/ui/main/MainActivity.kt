package com.test.drcsystempracticaltest.ui.main

import android.content.Intent
import android.os.Bundle
import com.test.drcsystempracticaltest.BR
import com.test.drcsystempracticaltest.R
import com.test.drcsystempracticaltest.data.model.IntroDataModel
import com.test.drcsystempracticaltest.databinding.ActivityMainBinding
import com.test.drcsystempracticaltest.ui.base.BaseActivity
import com.test.drcsystempracticaltest.ui.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>(),
    IntroAdapter.IntroAdapterCallback {


    override val layoutId: Int
        get() = R.layout.activity_main
    override val bindingVariable: Int
        get() = BR.viewModel

    override fun setupObservable() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewModel.addIntroData(this)

        val bannerAdapter = IntroAdapter(mViewModel.listIntro, this, this)
        viewDataBinding.vpIntro.adapter = bannerAdapter
        //  viewDataBinding.vpIntro.isUserInputEnabled = false
    }

    override fun onNextClick(position: Int) {
        if (position == mViewModel.listIntro.size - 1) {
            startActivity(Intent(this@MainActivity, HomeActivity::class.java))
            finish()
        } else {
            viewDataBinding.vpIntro.currentItem = viewDataBinding.vpIntro.currentItem + 1
        }
    }
}