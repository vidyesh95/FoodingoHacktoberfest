package com.codinginflow.foodingo.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.codinginflow.foodingo.BottomSheetDialog
import com.codinginflow.foodingo.R
import com.google.android.material.appbar.MaterialToolbar

class OrderFragment : Fragment() {

    companion object {
        fun newInstance() = OrderFragment()
    }

    private lateinit var viewModel: OrderViewModel

    var toolbarRef : MaterialToolbar ? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.order_fragment, container, false)
        toolbarRef = view.findViewById(R.id.toolbar)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OrderViewModel::class.java)
        // TODO: Use the ViewModel

        toolbarRef!!.setOnClickListener {
            val b = BottomSheetDialog()
            b.show(requireActivity().supportFragmentManager,"bottom sheet")
        }
    }

}