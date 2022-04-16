package com.test.drcsystempracticaltest.ui.home

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.test.drcsystempracticaltest.R
import com.test.drcsystempracticaltest.data.model.TaskDataModel
import com.test.drcsystempracticaltest.databinding.LayoutTaskBinding

class TaskListAdapter(val mContext: Context, val btnList: MutableList<TaskDataModel>) :
    BaseAdapter() {
    lateinit var mInflator: LayoutInflater

    var countBlueGrid = 0

    override fun getCount(): Int {
        return btnList.size
    }

    override fun getItem(position: Int): Any {
        return btnList.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View? {

        val holder: ButtonViewHolder

        if (convertView == null) {
            val itemBinding: LayoutTaskBinding = DataBindingUtil.inflate(
                LayoutInflater.from(mContext),
                R.layout.layout_task,
                viewGroup,
                false
            )
            holder = ButtonViewHolder(itemBinding)
            holder.view = itemBinding.getRoot()
            holder.view.setTag(holder)
        } else {
            holder = convertView.tag as ButtonViewHolder
        }




        return holder.view
    }


    private class ButtonViewHolder {
        lateinit var view: View
        lateinit var clHolder: ConstraintLayout

        constructor(binding: LayoutTaskBinding) {
            this.view = binding.getRoot();
            this.clHolder = binding.root.findViewById(R.id.cl_holder)
        }
    }


}