package com.example.idaidostore

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    private lateinit var etUsername: TextInputEditText
    private lateinit var etPassword: TextInputEditText
    private lateinit var btnLogin: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        // =========================
        // Efek Hover
        // =========================
        btnLogin.setOnHoverListener { view, event ->

            when (event.action) {

                MotionEvent.ACTION_HOVER_ENTER -> {
                    view.animate()
                        .scaleX(1.08f)
                        .scaleY(1.08f)
                        .setDuration(150)
                        .start()
                }

                MotionEvent.ACTION_HOVER_EXIT -> {
                    view.animate()
                        .scaleX(1f)
                        .scaleY(1f)
                        .setDuration(150)
                        .start()
                }
            }

            false
        }


        btnLogin.setOnClickListener {

            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            val usernameBenar = "kel4"
            val passwordBenar = "12345"

            // Reset error
            etUsername.error = null
            etPassword.error = null

            if (username.isEmpty()) {
                etUsername.error = "Username wajib diisi"
                etUsername.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                etPassword.error = "Password wajib diisi"
                etPassword.requestFocus()
                return@setOnClickListener
            }

            when {

                username == usernameBenar &&
                        password == passwordBenar -> {

                    Toast.makeText(
                        this,
                        "Login Berhasil",
                        Toast.LENGTH_SHORT
                    ).show()

                    val intent =
                        Intent(this, MainActivity::class.java)

                    startActivity(intent)
                    finish()
                }

                username == usernameBenar &&
                        password != passwordBenar -> {

                    etPassword.error = "Password salah"

                    Toast.makeText(
                        this,
                        "Password salah",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                username != usernameBenar &&
                        password == passwordBenar -> {

                    etUsername.error = "Username salah"

                    Toast.makeText(
                        this,
                        "Username salah",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                else -> {

                    etUsername.error = "Username salah"
                    etPassword.error = "Password salah"

                    Toast.makeText(
                        this,
                        "Username dan Password salah",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}