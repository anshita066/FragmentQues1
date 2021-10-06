package com.example.fragmentques1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        var btn1 = findViewById<View>(R.id.btnFragment1) as Button
        var btn2 = findViewById<View>(R.id.btnFragment2) as Button

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, firstFragment)
            commit()
        }

        btn1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        btn2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}