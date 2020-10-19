package com.codinginflow.foodingo.ui.explore

import com.codinginflow.foodingo.R
import com.codinginflow.foodingo.abstraction.BaseFragment
import com.codinginflow.foodingo.databinding.ExploreFragmentBinding

class ExploreFragment : BaseFragment<ExploreFragmentBinding, ExploreViewModel>() {

    companion object {
        fun newInstance() = ExploreFragment()
    }

    override fun layoutResourceId(): Int = R.layout.explore_fragment

    override fun getViewModelClass(): Class<ExploreViewModel> = ExploreViewModel::class.java

    override fun initViewCreated() {
        // TODO: Start your code here
    }

}