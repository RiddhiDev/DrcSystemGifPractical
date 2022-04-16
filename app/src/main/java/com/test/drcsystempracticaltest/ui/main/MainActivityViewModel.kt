package com.test.drcsystempracticaltest.ui.main

import android.content.Context
import androidx.lifecycle.ViewModel
import com.test.drcsystempracticaltest.R
import com.test.drcsystempracticaltest.data.model.IntroDataModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor() : ViewModel() {

    var listIntro: ArrayList<IntroDataModel> = arrayListOf()

    fun addIntroData(context: Context){
        listIntro.add(
            IntroDataModel(
                R.drawable.ic_plus,
                context.getString(R.string.add_your_task_to_mnage_your_daily_schedule),
                R.drawable.ic_next
            )
        )


        listIntro.add(
            IntroDataModel(
                R.drawable.ic_tap,
                context.getString(R.string.long_press_to_edit_delete_task),
                R.drawable.ic_next
            )
        )

        listIntro.add(
            IntroDataModel(
                R.drawable.ic_witch,
                context.getString(R.string.switch_toggle),
                R.drawable.ic_check
            )
        )

    }
}