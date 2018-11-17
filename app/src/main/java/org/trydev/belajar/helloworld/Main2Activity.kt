package org.trydev.belajar.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nama:TextView = findViewById(R.id.nama)
        val umur:TextView = findViewById(R.id.umur)

        val getNama = intent.getStringExtra("NAMA")
        val getUmur = intent.getStringExtra("UMUR").toInt()

        nama.text = "Nama : $getNama"
        umur.text = "Umur : $getUmur"

        when(getUmur){
            in 1..10 -> Toast.makeText(this,"Anak-anak", Toast.LENGTH_SHORT).show()
            in 11..17 -> Toast.makeText(this, "Pubertas", Toast.LENGTH_SHORT).show()
            in 18..25 -> Toast.makeText(this, "Remaja", Toast.LENGTH_SHORT).show()
            in 26..40 -> Toast.makeText(this, "Dewasa", Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(this, "Tua", Toast.LENGTH_SHORT).show()
        }

        val array = arrayOf(1..100)
        for (i in array.indices){
            println("Iterasi ke-${array[i]}")
        }
    }
}
