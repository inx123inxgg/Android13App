
package com.example.autotext

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private var running = false
    private var index = 0
    private val handler = Handler(Looper.getMainLooper())

    private val texts = listOf("Hello", "Welcome", "Auto Text Running", "Android 13 Project")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            running = !running
            if (running) {
                button.text = "Stop"
                cycleText()
            } else {
                button.text = "Start"
                handler.removeCallbacksAndMessages(null)
            }
        }
    }

    private fun cycleText() {
        if (running) {
            textView.text = texts[index % texts.size]
            index++
            handler.postDelayed({ cycleText() }, 2000)
        }
    }
}
