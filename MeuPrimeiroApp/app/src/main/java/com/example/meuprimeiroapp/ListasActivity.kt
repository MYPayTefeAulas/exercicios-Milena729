package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityListasBinding
import com.example.meuprimeiroapp.databinding.ActivityMainBinding

class ListasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListasBinding

    private val frutas = listOf ("maça" , "mamao", "abacate")
    private val vegetais = listOf("pepino", "alface" , "pimentao")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListasBinding.inflate(layoutInflater)

        binding.btAnalisar.setOnClickListener {
            binding.txtSaida.text = analisar (binding.txtEntrda.text.toString())
        }
        setContentView(binding.root)
    }

    fun analisar(entrada: String):String {
        var saida = ""


        for (fruta in frutas) {
            if (fruta == entrada) {
                saida = "É uma fruta"

                break
            }

        }
        for (vegetal in vegetais) {
            if (vegetal == entrada) {
                saida = "É um vegetal"
                break
            }

        }
        if (saida == ""){
            saida = "não sei o que é isso"
        }

            return saida
    }
}
