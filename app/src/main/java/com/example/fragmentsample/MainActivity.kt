package com.example.fragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 :Button = findViewById(R.id.bt1)
        val btn2 :Button = findViewById(R.id.bt2)

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fl , BlankFragment.newInstance())
                .commit()
        }

        btn2.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fl , BlankFragment2.newInstance())
                .commit()
        }
    }
}