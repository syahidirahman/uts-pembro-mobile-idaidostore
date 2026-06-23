package com.example.idaidostore

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import com.example.idaidostore.activity.DashboardActivity

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnHome = findViewById<LinearLayout>(R.id.btnHome)
        val btnTentang = findViewById<LinearLayout>(R.id.btnTentang)
        val btnKeluar = findViewById<LinearLayout>(R.id.btnKeluar)

        btnHome.setOnClickListener {
            startActivity(Intent(this@About, DashboardActivity::class.java))
            finish()
        }

        btnKeluar.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Konfirmasi Logout")
                .setMessage("Apakah Anda yakin ingin keluar?")
                .setPositiveButton("Ya") { _, _ ->

                    val intent = Intent(this@About, LoginActivity::class.java)
                    startActivity(intent)
                    finish() // finish() digunakan agar setelah logout, user tidak bisa menekan tombol "Back" ke dashboard lagi

                }
                .setNegativeButton("Batal", null)
                .show()
        }
    }
}