package com.laraknife.basketballscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.laraknife.basketballscore.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Recuperación de los datos //
        val local = intent.getStringExtra("local")
        val visitante = intent.getStringExtra("visitante")
    }
}