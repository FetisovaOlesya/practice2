package com.example.practicetask2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RecipesActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)
    }

    fun changeToMainActivity(view: View) {
        val intentToChangeToMainActivity = Intent(this, MainActivity::class.java)
        startActivity(intentToChangeToMainActivity)
    }


    fun changeToRecipeActivity(view: View) {
        val intentToRecipeActivity = Intent(this, RecipeActivity::class.java)
        startActivity(intentToRecipeActivity)
    }

}