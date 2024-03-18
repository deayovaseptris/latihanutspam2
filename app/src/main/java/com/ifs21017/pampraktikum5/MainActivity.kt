package com.ifs21017.pampraktikum5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBuy = findViewById<Button>(R.id.btnBuy)

        btnBuy.setOnClickListener{
            Toast.makeText(application, "Kamu membeli produk ini!", Toast.LENGTH_SHORT).show()
        }
    }
}