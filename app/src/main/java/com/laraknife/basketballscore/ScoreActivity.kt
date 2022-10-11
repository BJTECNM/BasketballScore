package com.laraknife.basketballscore

import com.laraknife.basketballscore.databinding.ActivityScoreBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recuperación de los datos //
        val local = intent.getStringExtra("local")
        val visita = intent.getStringExtra("visitante")

        // Se define el marcador //
        binding.txtMarcador.text="$local - $visita"

        // Se define el mensaje a mostrar del ganador //
        if (local == visita){
            binding.txtResultMessage.text="Fue un empate"
            binding.imgResultado.setImageResource(R.drawable.empate)
        }else if (local!! < visita!!){
            binding.txtResultMessage.text="¡Ganaron los visitantes!"
            binding.imgResultado.setImageResource(R.drawable.ganadorvisitante)
        }else{
            binding.txtResultMessage.text="¡Ganó el equipo local!"
            binding.imgResultado.setImageResource(R.drawable.ganadorlocal)
        }
    }
}