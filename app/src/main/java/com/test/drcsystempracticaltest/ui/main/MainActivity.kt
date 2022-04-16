package com.test.drcsystempracticaltest.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.test.drcsystempracticaltest.BR
import com.test.drcsystempracticaltest.R
import com.test.drcsystempracticaltest.data.model.IntroDataModel
import com.test.drcsystempracticaltest.databinding.ActivityMainBinding
import com.test.drcsystempracticaltest.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>() {


    override val layoutId: Int
        get() = R.layout.activity_main
    override val bindingVariable: Int
        get() = BR.viewModel

    var listIntro: ArrayList<IntroDataModel> = arrayListOf()

    override fun setupObservable() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listIntro.add(
            IntroDataModel(
                R.drawable.ic_plus,
                getString(R.string.add_your_task_to_mnage_your_daily_schedule),
                R.drawable.ic_next
            )
        )


        listIntro.add(
            IntroDataModel(
                R.drawable.ic_tap,
                getString(R.string.long_press_to_edit_delete_task),
                R.drawable.ic_next
            )
        )

        listIntro.add(
            IntroDataModel(
                R.drawable.ic_witch,
                getString(R.string.switch_toggle),
                R.drawable.ic_check
            )
        )

    }
}