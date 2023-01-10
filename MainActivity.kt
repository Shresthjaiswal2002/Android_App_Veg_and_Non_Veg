package com.example.vegandnonvegapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rgrp = findViewById<RadioGroup>(R.id.rgrp)
        var submit = findViewById<Button>(R.id.submit)
        submit.setOnClickListener(){
            var selectId = rgrp.checkedRadioButtonId
            if (selectId == -1){
                Toast.makeText(this,"Please select any one!!", Toast.LENGTH_SHORT).show()
            } else {
                val intent= Intent(this,result::class.java)
                startActivity(intent)
            }
        }
    }
}
