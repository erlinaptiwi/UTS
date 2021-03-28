package com.example.aplikasipenentugenerasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi
        var edthnlahir = findViewById<EditText>(R.id.ed_tahun_lahir)
        var btnklik = findViewById<Button>(R.id.btn_klik)
        var tvhasil = findViewById<TextView>(R.id.tv_hasil)

        btnklik.setOnClickListener {
            val input = edthnlahir.text.toString()
            val hasil = when (input.toInt()){
                in 1946..1964 -> "Baby Boomers"
                in 1965..1980 -> "X"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "Z"
                else -> "Tidak Terdeteksi"
            }
            tvhasil.text = "Kamu Generasi $hasil"
        }
    }
}