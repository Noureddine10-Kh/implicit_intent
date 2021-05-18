package com.noureddine10kh.implicit_intent.ui


import android.content.Intent
import android.view.LayoutInflater
import com.noureddine10kh.implicit_intent.databinding.ActivityMainBinding
import com.noureddine10kh.implicit_intent.util.Constant

class MainActivity : BaseActivity<ActivityMainBinding>(){

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun addCallBacks() {
        binding?.apply {
            openButton.setOnClickListener {
               val intent = Intent("intent.action.SEND")
               intent.putExtra(Constant.EXTRA_MSG,stringData.text.toString())
                startActivity(intent)
            }
        }
    }
}