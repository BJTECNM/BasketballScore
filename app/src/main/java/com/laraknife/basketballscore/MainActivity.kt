package com.laraknife.basketballscore

import com.laraknife.basketballscore.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Equipo Local //
        binding.lessLocButton.setOnClickListener {
            var aux = binding.txtCountLocal.text.toString().toInt()
            if (aux == 0)
                Toast.makeText(this,"Ya tiene el valor mínimo",Toast.LENGTH_LONG).show()
            else{
                aux -= 1
                binding.txtCountLocal.text = aux.toString()
            }
        }

        binding.moreLocButton.setOnClickListener {
            var aux = binding.txtCountLocal.text.toString().toInt()
            aux += 1
            binding.txtCountLocal.text = aux.toString()
            Toast.makeText(this,"Se añadio 1 punto al equipo Local",Toast.LENGTH_LONG).show()
        }

        binding.more2LocButton.setOnClickListener {
            var aux = binding.txtCountLocal.text.toString().toInt()
            aux += 2
            binding.txtCountLocal.text = aux.toString()
            Toast.makeText(this,"Se añadio 2 punto al equipo Local",Toast.LENGTH_LONG).show()
        }

        // Equipo Visitante //
        binding.lessVisButton.setOnClickListener {
            var aux = binding.txtCountVisitante.text.toString().toInt()
            if (aux == 0)
                Toast.makeText(this,"Ya tiene el valor mínimo",Toast.LENGTH_LONG).show()
            else{
                aux -= 1
                binding.txtCountVisitante.text = aux.toString()
            }
        }

        binding.moreVisButton.setOnClickListener {
            var aux = binding.txtCountVisitante.text.toString().toInt()
            aux += 1
            binding.txtCountVisitante.text = aux.toString()
            Toast.makeText(this,"Se añadio 1 punto al equipo Visitante",Toast.LENGTH_LONG).show()
        }

        binding.more2VisButton.setOnClickListener {
            var aux = binding.txtCountVisitante.text.toString().toInt()
            aux += 2
            binding.txtCountVisitante.text = aux.toString()
            Toast.makeText(this,"Se añadio 2 punto al equipo Visitante",Toast.LENGTH_LONG).show()
        }

        // Reset //
        binding.resetButton.setOnClickListener {
            val aux = 0
            binding.txtCountLocal.text = aux.toString()
            binding.txtCountVisitante.text = aux.toString()
            Toast.makeText(this,"Se han reiniciado los contadores",Toast.LENGTH_LONG).show()
        }

        // Resultados //
        binding.resultButton.setOnClickListener {
            // Definiendo los parametros a enviar //
            val local = binding.txtCountLocal.text.toString()
            val visitante = binding.txtCountVisitante.text.toString()

            // Llamado a la segunda activity pasando parametros //
            startActivity(Intent(applicationContext,ScoreActivity::class.java).apply {
                putExtra("local", local); putExtra("visitante", visitante) })
        }
    }
}