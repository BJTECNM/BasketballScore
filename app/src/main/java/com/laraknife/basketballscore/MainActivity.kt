package com.laraknife.basketballscore

import com.laraknife.basketballscore.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tareas a Realizar //

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