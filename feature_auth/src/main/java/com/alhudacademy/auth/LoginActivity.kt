package com.alhudacademy.auth

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Creating a dynamic layout for Al-Huda-Academy Login
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(50, 100, 50, 50)
        }

        val etUserId = EditText(this).apply {
            hint = "Enter ID (Staff / Guardian / Student)"
        }

        val etPassword = EditText(this).apply {
            hint = "Enter Password"
            isSingleLine = true
        }

        val btnLogin = Button(this).apply {
            text = "Login to Portal"
            setOnClickListener {
                if (etUserId.text.toString().isNotEmpty()) {
                    Toast.makeText(context, "Logging in for ID: ${etUserId.text}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Please enter your ID first!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        layout.addView(etUserId)
        layout.addView(etPassword)
        layout.addView(btnLogin)

        setContentView(layout)
    }
}
