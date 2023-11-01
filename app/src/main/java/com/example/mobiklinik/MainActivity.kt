package com.example.mobiklinik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBook = findViewById<Button>(R.id.book_now_btn)
        buttonBook.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)

        }

        val buttonClick = findViewById<Button>(R.id.dismiss_btn)
        buttonClick.setOnClickListener {
            finish()
        }
    }
}