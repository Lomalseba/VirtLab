package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTextViewClicked(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}