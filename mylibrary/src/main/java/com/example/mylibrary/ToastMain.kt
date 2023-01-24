package com.example.mylibrary

import android.content.Context
import android.widget.Toast

object ToastMain {

    fun createToast(context:Context, message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}