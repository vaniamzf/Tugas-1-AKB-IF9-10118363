package com.example.tugas1_akb_if9_10118363

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.tugas1_akb_if9_10118363.R
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var i = intent
        val text = i.getStringExtra("Nama")

        val hasil = findViewById<TextView>(R.id.textKamu)
        hasil.text = "Beres! "


        btnOke.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
/*10118363 - Vania Yulianti M - IF9 - 7 April 2021*/

