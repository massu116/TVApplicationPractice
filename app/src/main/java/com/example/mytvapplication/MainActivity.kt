package com.example.mytvapplication

import android.os.Bundle
import android.app.Activity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textMessage = findViewById<TextView>(R.id.textMessage)
        var button = findViewById<Button>(R.id.button)
        var clear = findViewById<Button>(R.id.clearButton)
        var i: Int = 0

        button.setOnClickListener{
            i += 1
            textMessage.text = i.toString()
        }
        clear.setOnClickListener{
            i = 0
            textMessage.text = i.toString()
        }
    }
}