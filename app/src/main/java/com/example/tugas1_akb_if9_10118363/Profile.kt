package com.example.tugas1_akb_if9_10118363

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.tugas1_akb_if9_10118363.R
import kotlinx.android.synthetic.main.activity_profile.*
import java.util.regex.Pattern

class Profile : AppCompatActivity() {
    lateinit var Nama : EditText
    lateinit var btn : Button
    
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Nama = findViewById(R.id.textView3)
        btn = findViewById(R.id.btnLogout)

        btn.setOnClickListener {
            val nama = Nama.text.toString()
            val umur = textView5.text.toString()

            if (nama.isEmpty() && umur.isEmpty()){
                Toast.makeText(this, "Nama Dan Umur Harus Diisi !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (nama.isEmpty()){
                Toast.makeText(this, "Nama Harus Diisi !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (umur.isEmpty()){
                Toast.makeText(this, "Umur Harus Diisi !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, Home::class.java)
            intent.putExtra("Nama", nama)
            startActivity(intent)
        }
    }
}
/*10118363 - Vania Yulianti M - 7 April 2021*/

