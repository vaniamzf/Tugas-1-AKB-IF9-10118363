package com.example.tugas1_akb_if9_10118363

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas1_akb_if9_10118363.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMulai.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }
    }
}

/*10118363 - Vania Yulianti M - IF9 - 7 April 2021*/
