package com.example.pd.ui.lab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pd.R
import com.example.pd.ui.registration.Registration

class endLab : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_endlab)

        val labBack = findViewById<Button>(R.id.lab_back_button)
        labBack.setOnClickListener {
            val startLabIntent = Intent(this, startLab::class.java)
            startActivity(startLabIntent)
        }
    }

}