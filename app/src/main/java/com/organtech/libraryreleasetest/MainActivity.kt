package com.organtech.libraryreleasetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.organtech.testlib.UtilTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UtilTest.showTestActivity(this)
    }
}