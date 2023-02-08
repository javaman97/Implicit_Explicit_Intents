package com.example.implicit_explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnimplicit=findViewById<CardView>(R.id.cardview_implicit_intent)
        btnimplicit.setOnClickListener {
            val intent= Intent(this,ImplicitActivity::class.java)
            startActivity(intent)
        }
    }
}