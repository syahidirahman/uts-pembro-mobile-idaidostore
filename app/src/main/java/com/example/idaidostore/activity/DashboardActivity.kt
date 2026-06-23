package com.example.idaidostore.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.idaidostore.About
import com.example.idaidostore.LoginActivity
import com.example.idaidostore.R
import com.example.idaidostore.adapter.ProductAdapter
import com.example.idaidostore.model.Product
import androidx.appcompat.app.AlertDialog

class DashboardActivity : AppCompatActivity() {

    private lateinit var adapter: ProductAdapter
    private var fullProductList: List<Product> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode(androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_dashboard)

        val rvProducts: RecyclerView = findViewById(R.id.rvProducts)
        rvProducts.layoutManager = GridLayoutManager(this, 2)

        // Simpan semua data produk
        fullProductList = listOf(
            Product("Mobile Legend Diamond", "Game", "Rp15.000,00", R.drawable.diamond),
            Product("Free Fire Diamond", "Game", "Rp8.000,00", R.drawable.diamond),
            Product("Kaos Oversize Premium", "Fashion", "Rp99.000,00", R.drawable.kaos),
            Product("Hoodie Casual Unisex", "Fashion", "Rp209.000,00", R.drawable.hoodie),
            Product("Burger Beef Deluxe", "Makanan", "Rp25.000,00", R.drawable.burger),
            Product("Pizza Paperoni Medium", "Makanan", "Rp99.000,00", R.drawable.pizza),
            Product("Samsung Galaxy S24", "Elektronik", "Rp10.000.000,00", R.drawable.samsung),
            Product("Smart TV 43 Inch", "Elektronik", "Rp3.599.000,00", R.drawable.smart_tv)
        )

        adapter = ProductAdapter(fullProductList)
        rvProducts.adapter = adapter

        val btnSemua: Button = findViewById(R.id.btnSemua)
        val btnGame: Button = findViewById(R.id.btnGame)
        val btnFashion: Button = findViewById(R.id.btnFashion)
        val btnElektronik: Button = findViewById(R.id.btnElektronik)
        val btnMakanan: Button = findViewById(R.id.btnMakanan)
        val btnTentang = findViewById<LinearLayout>(R.id.btnTentang)
        val btnKeluar = findViewById<LinearLayout>(R.id.btnKeluar)

        btnSemua.setOnClickListener { filterKategori("Semua", btnSemua) }
        btnGame.setOnClickListener { filterKategori("Game", btnGame) }
        btnFashion.setOnClickListener { filterKategori("Fashion", btnFashion) }
        btnElektronik.setOnClickListener { filterKategori("Elektronik", btnElektronik) }
        btnMakanan.setOnClickListener { filterKategori("Makanan", btnMakanan) }

        btnTentang.setOnClickListener {
            val intent = Intent(this@DashboardActivity, About::class.java)
            startActivity(intent)
        }

        btnKeluar.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Konfirmasi Logout")
                .setMessage("Apakah Anda yakin ingin keluar?")
                .setPositiveButton("Ya") { _, _ ->
                    val intent = Intent(this@DashboardActivity, LoginActivity::class.java)

                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intent)

                    finishAffinity()
                }
                .setNegativeButton("Batal", null)
                .show()
        }
    }

    // FUNGSI UNTUK FILTER DATA
    private fun filterKategori(kategori: String, activeButton: Button) {

        if (kategori == "Semua") {
            adapter.updateData(fullProductList)
        } else {
            val filteredList = fullProductList.filter { it.category == kategori }
            adapter.updateData(filteredList)
        }

        val allButtons = listOf(
            findViewById<Button>(R.id.btnSemua),
            findViewById<Button>(R.id.btnGame),
            findViewById<Button>(R.id.btnFashion),
            findViewById<Button>(R.id.btnElektronik),
            findViewById<Button>(R.id.btnMakanan)
        )

        for (btn in allButtons) {
            btn.backgroundTintList = ContextCompat.getColorStateList(this, R.color.white)
            btn.setTextColor(ContextCompat.getColor(this, R.color.idaido_primary))
        }

        activeButton.backgroundTintList = ContextCompat.getColorStateList(this, R.color.idaido_primary)
        activeButton.setTextColor(ContextCompat.getColor(this, R.color.white))
    }
}