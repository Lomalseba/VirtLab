package com.example.pd.ui.lab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pd.R
import com.example.pd.ui.registration.Registration

class Lab: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startLab)

        val homeBack = findViewById <Button> (R.id.home_back)
        homeBack.setOnClickListener {
            this.finish()
        }

        val next = findViewById <Button> (R.id.next)

        next.setOnClickListener {
            val labIntent = Intent(this, Registration::class.java)
            startActivity(labIntent)
        }
    }

}