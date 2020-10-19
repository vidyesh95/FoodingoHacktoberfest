package com.codinginflow.foodingo.ui.spaces

import com.codinginflow.foodingo.R
import com.codinginflow.foodingo.abstraction.BaseFragment
import com.codinginflow.foodingo.databinding.SpacesFragmentBinding

class SpacesFragment : BaseFragment<SpacesFragmentBinding, SpacesViewModel>() {

    companion object {
        fun newInstance() = SpacesFragment()
    }

    override fun layoutResourceId(): Int = R.layout.spaces_fragment

    override fun getViewModelClass(): Class<SpacesViewModel> = SpacesViewModel::class.java

    override fun initViewCreated() {
        // TODO: Start your code here
    }

}