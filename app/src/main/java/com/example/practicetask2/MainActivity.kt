package com.example.practicetask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun changeToRecipesActivity(view: View) {
        val intentToRecipesActivity = Intent(this, RecipesActivity::class.java)
        startActivity(intentToRecipesActivity)
    }
}