package com.test.drcsystempracticaltest.ui.home

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.test.drcsystempracticaltest.BR
import com.test.drcsystempracticaltest.R
import com.test.drcsystempracticaltest.databinding.ActivityHomeBinding
import com.test.drcsystempracticaltest.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.dialog_bottomsheet_add_task.*
import kotlinx.android.synthetic.main.dialog_bottomsheet_add_task.view.*
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {

    private var bottomSheetBehavior: BottomSheetBehavior<*>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding.ivAddTask.setOnClickListener {
            setBottomSheetExpanded()
        }

        viewDataBinding.addtaskDialog.clAddtaskHolder.iv_cancel.setOnClickListener {
            setBottomSheetCollapsed()
        }

        bottomSheetBehavior =
            BottomSheetBehavior.from<View>(viewDataBinding.addtaskDialog.clAddtaskHolder)
    }

    override val layoutId: Int
        get() = R.layout.activity_home
    override val bindingVariable: Int
        get() = BR.viewModel

    override fun setupObservable() {

    }

    override fun onResume() {
        super.onResume()
        setBottomSheetCollapsed()
    }


    private fun setBottomSheetExpanded() {
        bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_EXPANDED
        setCurrentDate()
    }

    private fun setBottomSheetCollapsed() {
        bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_COLLAPSED
    }

    private fun setCurrentDate() {
        val currentTime: Date = Calendar.getInstance().getTime()

        /*   var originalFormat =  SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
           var targetFormat =  SimpleDateFormat("Mon dd, yyyy");
           var date = originalFormat.parse(currentTime.toString());
           var formattedDate = targetFormat.format(date);*/

        viewDataBinding.addtaskDialog.clAddtaskHolder.let {

            tv_selected_date.text = currentTime.date.toString()
            tv_selected_time.text = currentTime.time.toString()
        }

    }

}