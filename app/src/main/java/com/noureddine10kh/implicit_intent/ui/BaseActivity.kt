package com.noureddine10kh.implicit_intent.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {

    abstract val bindingInflater : (LayoutInflater) -> VB
    private var _binding :ViewBinding? = null
    protected val binding
        get() = _binding as VB?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        addCallBacks()
    }

    abstract fun addCallBacks()

}