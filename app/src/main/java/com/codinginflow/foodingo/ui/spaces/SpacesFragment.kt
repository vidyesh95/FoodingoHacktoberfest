package com.codinginflow.foodingo.ui.spaces

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.codinginflow.foodingo.R

class SpacesFragment : Fragment() {

    companion object {
        fun newInstance() = SpacesFragment()
    }

    private lateinit var viewModel: SpacesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.spaces_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SpacesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}