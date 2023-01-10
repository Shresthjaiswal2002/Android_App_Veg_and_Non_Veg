package com.example.vegandnonvegapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        lateinit var lst_view: ListView
        lateinit var lst_view1: ListView
        lst_view = findViewById(R.id.lst_view)
        lst_view1 = findViewById(R.id.lst_view1)
        val b = arrayOf("Dal Fry", "Punjabi Dal", "Fried Rice")
        val a = arrayOf("Chicken Tikka", "Chicken Fry", "Chicken Rice")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        lst_view.adapter = adapter
        lst_view1.adapter = adapter

        lst_view.setOnItemClickListener { adapterView, view, i, l ->
            lst_view1.setOnItemClickListener { adapterView, view, i, l ->


            }
        }
    }
}