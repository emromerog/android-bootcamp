package com.example.android_bootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun allClearAction(view: View) {
        //workingsTV.text = ""
        //resultsTV.text = ""
    }

    fun backSpaceAction(view: View) {}
    fun equalsAction(view: View) {}
}