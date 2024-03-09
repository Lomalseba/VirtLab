package com.example.pd.ui.lab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pd.R
import com.example.pd.ui.registration.Registration

class startLab : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startlab)

        val homeBack = findViewById<Button>(R.id.home_back)
        homeBack.setOnClickListener {
            this.finish()
        }

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            val endLabIntent = Intent(this, endLab::class.java)
            startActivity(endLabIntent)
        }
    }

}