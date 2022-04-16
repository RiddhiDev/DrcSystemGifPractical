package com.test.drcsystempracticaltest.ui.base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import javax.inject.Inject


abstract class BaseActivity<T : ViewDataBinding, V : ViewModel> : ComponentActivity() {

    abstract val layoutId: Int
    abstract val bindingVariable: Int


    @Inject
    lateinit var mViewModel: V
    lateinit var viewDataBinding: T


    abstract fun setupObservable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        performDataBinding()
        setupObservable()
    }

    private fun performDataBinding() {
        viewDataBinding = DataBindingUtil.setContentView(this, layoutId)
        viewDataBinding.setVariable(bindingVariable, mViewModel)
        viewDataBinding.executePendingBindings()
    }

}