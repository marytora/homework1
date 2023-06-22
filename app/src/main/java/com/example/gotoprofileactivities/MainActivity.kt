package com.example.gotoprofileactivities


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setContentView(R.layout.activity_main)

        val skipButtonFirst = findViewById<Button>(R.id.skipButtonFirst)
        val skipButtonSecond = findViewById<Button>(R.id.skipButtonSecond)

        skipButtonFirst.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
            }
        })

        skipButtonSecond.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
            }
        })
    }
}