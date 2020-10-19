package com.codinginflow.foodingo.ui.order

import com.codinginflow.foodingo.BottomSheetDialog
import com.codinginflow.foodingo.R
import com.codinginflow.foodingo.abstraction.BaseFragment
import com.codinginflow.foodingo.databinding.OrderFragmentBinding

class OrderFragment : BaseFragment<OrderFragmentBinding, OrderViewModel>() {

    companion object {
        fun newInstance() = OrderFragment()
    }

    override fun layoutResourceId(): Int = R.layout.order_fragment

    override fun getViewModelClass(): Class<OrderViewModel> = OrderViewModel::class.java

    override fun initViewCreated() {
        // TODO: Start your code here
        binding.toolbar.setOnClickListener {
            val b = BottomSheetDialog()
            b.show(requireActivity().supportFragmentManager, "bottom sheet")
        }
    }

}