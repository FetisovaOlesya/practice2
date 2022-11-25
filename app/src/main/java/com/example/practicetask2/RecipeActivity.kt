package com.example.practicetask2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RecipeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)
    }

    fun changeToBackActivity(view: View) {
        val intentToChangeToBackActivity = Intent(this, RecipesActivity::class.java)
        startActivity(intentToChangeToBackActivity)
    }

    fun saveAndChangeToBackActivity(view: View) {
        //save
        changeToBackActivity(view)
    }

}