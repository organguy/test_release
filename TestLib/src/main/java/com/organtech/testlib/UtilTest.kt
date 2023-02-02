package com.organtech.testlib

import android.content.Context
import android.content.Intent

class UtilTest {
    companion object{
        fun showTestActivity(context: Context){
            var intent = Intent(context, TestActivity::class.java)
            context.startActivity(intent)
        }
    }
}