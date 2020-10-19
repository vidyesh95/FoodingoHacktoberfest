package com.codinginflow.foodingo.ui.goout

import com.codinginflow.foodingo.R
import com.codinginflow.foodingo.abstraction.BaseFragment
import com.codinginflow.foodingo.databinding.GoOutFragmentBinding

class GoOutFragment : BaseFragment<GoOutFragmentBinding, GoOutViewModel>() {

    companion object {
        fun newInstance() = GoOutFragment()
    }

    override fun layoutResourceId(): Int = R.layout.go_out_fragment

    override fun getViewModelClass(): Class<GoOutViewModel> = GoOutViewModel::class.java

    override fun initViewCreated() {
        // TODO: Start your code here
    }

}