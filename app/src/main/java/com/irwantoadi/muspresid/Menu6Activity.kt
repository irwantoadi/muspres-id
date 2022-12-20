package com.irwantoadi.muspresid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Menu6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu6)
        val btn_back: Button = findViewById(R.id.btn_back)

        btn_back.setOnClickListener {
            finish()
        }
    }
}