package com.adprogress.numberincrementer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var incrNumber = 0

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
//        numberTextView.setText("HELLO BELLO!")

        val resetButton = findViewById<Button>(R.id.resetButton)
        resetButton.setOnClickListener(View.OnClickListener {
            incrNumber = 0
            numberTextView.setText("Number is: $incrNumber")
        })

        val incrementButton = findViewById<Button>(R.id.incrementButton)
        incrementButton.setOnClickListener(View.OnClickListener {
            incrNumber += 1
            numberTextView.setText("Number is: $incrNumber")
        })
    }
}
