package com.laraknife.basketballscore

import com.laraknife.basketballscore.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

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

    }
}


/* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcular.setOnClickListener {
            val edadString = binding.edad.text.toString()
            if (edadString.isEmpty()){
                Toast.makeText(this,"Ingrese una edad",Toast.LENGTH_LONG).show()
            }else{
                val age = edadString.toInt()
                val edaddog = age * 7
                binding.resultado.text = "Su edad es años perro sería $edaddog"
            }
        }
    }
 */