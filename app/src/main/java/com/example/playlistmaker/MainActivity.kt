package com.example.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button1 = findViewById<Button>(R.id.search_button)

        button1.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на кнопку №1!", Toast.LENGTH_SHORT).show()
        }

        val button2 = findViewById<Button>(R.id.media_button)

        val button2Listener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку №2!", Toast.LENGTH_SHORT).show()
            }
        }

        button2.setOnClickListener(button2Listener)

        val button3 = findViewById<Button>(R.id.settings_button)

        val button3Listener: View.OnClickListener =
            View.OnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Нажали на кнопку №3!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        button3.setOnClickListener(button3Listener)
    }
}