package com.noureddine10kh.implicit_intent.ui


import android.view.LayoutInflater
import com.noureddine10kh.implicit_intent.databinding.ActivitySecondBinding
import com.noureddine10kh.implicit_intent.util.Constant

class SecondActivity : BaseActivity<ActivitySecondBinding>(){

    override val bindingInflater: (LayoutInflater) -> ActivitySecondBinding = ActivitySecondBinding::inflate


    override fun addCallBacks() {
       binding?.apply {
           receiveData.text = intent.getStringExtra(Constant.EXTRA_MSG)
       }
    }

}