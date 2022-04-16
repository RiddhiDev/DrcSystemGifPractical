package com.test.drcsystempracticaltest.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.drcsystempracticaltest.data.model.IntroDataModel
import com.test.drcsystempracticaltest.databinding.LayoutIntroBinding
import com.test.drcsystempracticaltest.ui.base.BaseViewHolder

class IntroAdapter(
    val introList: ArrayList<IntroDataModel>,
    var context: Context,
    val introAdapterCallback: IntroAdapterCallback
) : RecyclerView.Adapter<IntroAdapter.IntroViewHolder>() {

    inner class IntroViewHolder(itemView: LayoutIntroBinding) :
        BaseViewHolder(itemView.getRoot()) {
        private val binding: LayoutIntroBinding

        override fun onBind() {

            binding.dataModel = introList.get(adapterPosition)
            binding.ivNext.setOnClickListener {
                introAdapterCallback.onNextClick(adapterPosition)
            }
        }

        init {
            binding = itemView
        }
    }

    interface IntroAdapterCallback {
        fun onNextClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {
        val binding: LayoutIntroBinding =
            LayoutIntroBinding.inflate(LayoutInflater.from(context), parent, false)
        return IntroViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {
        holder.onBind()
    }

    override fun getItemCount(): Int {
        return introList.size
    }
}