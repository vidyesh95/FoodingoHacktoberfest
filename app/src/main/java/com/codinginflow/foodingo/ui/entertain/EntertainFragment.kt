package com.codinginflow.foodingo.ui.entertain

import com.codinginflow.foodingo.R
import com.codinginflow.foodingo.abstraction.BaseFragment
import com.codinginflow.foodingo.databinding.EntertainFragmentBinding

class EntertainFragment : BaseFragment<EntertainFragmentBinding, EntertainViewModel>() {

    companion object {
        fun newInstance() = EntertainFragment()
    }

    override fun layoutResourceId(): Int = R.layout.entertain_fragment

    override fun getViewModelClass(): Class<EntertainViewModel> = EntertainViewModel::class.java

    override fun initViewCreated() {
        // TODO: Start your code here
    }

}