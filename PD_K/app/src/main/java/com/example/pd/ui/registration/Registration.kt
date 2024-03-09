package com.example.pd.ui.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pd.R

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val reg = findViewById<Button>(R.id.button_registration)
        reg.setOnClickListener {
            this.finish()
        }
    }
}