package com.codinginflow.foodingo.ui.goout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.codinginflow.foodingo.R

class GoOutFragment : Fragment() {

    companion object {
        fun newInstance() = GoOutFragment()
    }

    private lateinit var viewModel: GoOutViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.go_out_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GoOutViewModel::class.java)
        // TODO: Use the ViewModel
    }

}