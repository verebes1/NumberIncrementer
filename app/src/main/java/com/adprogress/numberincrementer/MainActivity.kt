package com.adprogress.numberincrementer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numberCounter = 0

    fun reset(view: View) {
        numberCounter = 0
        numberTextView.text = "Number is: $numberCounter"
    }

    fun addOne(view: View) {
        numberCounter += 1
        numberTextView.text = "Number is: $numberCounter"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
