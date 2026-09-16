package com.alhudacademy.admin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AdminDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = android.widget.LinearLayout(this).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            setPadding(40, 40, 40, 40)
        }

        val tvTitle = TextView(this).apply {
            text = "Al-Huda Academy - Admin Portal"
            textSize = 20f
            setTypeface(null, android.graphics.Typeface.BOLD)
        }

        val menuOptions = arrayOf("Manage Students", "Manage Staff", "Notice Board", "Fee Reports")
        val listView = ListView(this)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menuOptions)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Opening: ${menuOptions[position]}", Toast.LENGTH_SHORT).show()
        }

        layout.addView(tvTitle)
        layout.addView(listView)
        setContentView(layout)
    }
}
