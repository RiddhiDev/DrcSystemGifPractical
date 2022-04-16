package com.test.drcsystempracticaltest.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.drcsystempracticaltest.BR
import com.test.drcsystempracticaltest.R
import com.test.drcsystempracticaltest.databinding.ActivityHomeBinding
import com.test.drcsystempracticaltest.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding.ivAddTask.setOnClickListener {

        }
    }

    override val layoutId: Int
        get() = R.layout.activity_home
    override val bindingVariable: Int
        get() = BR.viewModel

    override fun setupObservable() {

    }
}