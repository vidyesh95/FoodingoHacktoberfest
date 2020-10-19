package com.codinginflow.foodingo.abstraction

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseFragment<out B : ViewDataBinding, V : ViewModel> : Fragment() {
    private lateinit var viewDataBinding: B

    val binding: B
        get() = viewDataBinding

    lateinit var vm: V

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    @LayoutRes
    protected abstract fun layoutResourceId(): Int
    protected abstract fun getViewModelClass(): Class<V>
    protected abstract fun initViewCreated()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = DataBindingUtil.inflate(inflater, layoutResourceId(), container, false)
        vm = ViewModelProvider(this, factory)[getViewModelClass()]
        viewDataBinding.lifecycleOwner = this
        viewDataBinding.executePendingBindings()
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewCreated()
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    protected fun hideKeyboard() {
        requireActivity().currentFocus.let {
            (requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager)
                .hideSoftInputFromWindow(it?.windowToken, 0)
        }
    }
}