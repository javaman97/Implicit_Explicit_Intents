package com.example.implicit_explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class ImplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)
        val btnProfile=findViewById<CardView>(R.id.cardview_profile)
        val btnCamera=findViewById<CardView>(R.id.cardview_camera)
        val btnYoutube=findViewById<CardView>(R.id.cardview_youtube)
        val btnMessage=findViewById<CardView>(R.id.cardview_message)
        val btnMoreinfo=findViewById<CardView>(R.id.cardview_moreinfointent)
        btnProfile.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.linkedin.com/in/java-aman/")
            startActivity(intent)
        }
        btnCamera.setOnClickListener {
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        btnYoutube.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.youtube.com/@saumya1singh")
            startActivity(intent)
        }
        btnMessage.setOnClickListener {
            val sendIntent = Intent(Intent.ACTION_SEND)
            sendIntent.putExtra(Intent.EXTRA_TEXT,"Hello Everyone")
            sendIntent.type="type/plain"
            startActivity(Intent.createChooser(sendIntent,"Send to:"))
        }
        btnMoreinfo.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.android.com/guide/components/intents-filters")
            startActivity(intent)
        }
    }
}