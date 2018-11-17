package org.trydev.belajar.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNama:EditText = findViewById(R.id.input_nama)
        val inputUmur:EditText = findViewById(R.id.input_umur)
        val submit: Button = findViewById(R.id.submit)

        submit.setOnClickListener {
            Toast.makeText(this, "Nama = ${inputNama.text.toString()}, Umur = ${inputUmur.text.toString()}", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this,Main2Activity::class.java)
            intent.putExtra("NAMA", inputNama.text.toString())
            intent.putExtra("UMUR", inputUmur.text.toString())
            startActivity(intent)
        }
    }
}
