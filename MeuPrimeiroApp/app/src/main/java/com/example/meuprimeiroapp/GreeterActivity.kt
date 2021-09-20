package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityGreeterBinding

class GreeterActivity : AppCompatActivity() {
    private lateinit var biding: ActivityGreeterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        biding = ActivityGreeterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(biding.root)
        var indiceAtual = 0
        val greeter1 = Greeter("Olá")
        val greeter2 = Greeter("Oi")
        val greeter3 = Greeter("Bem vindo")
        var greeterAtual = greeter1
        var listaNomes = mutableListOf<String>()
        listaNomes.add("Maria")
        listaNomes.add("João")
        listaNomes.add("Pedro")
        biding.btImprimirProximo.setOnClickListener {
            val nomeAtual = listaNomes[indiceAtual]
            biding.txtSaidaGreeter.text = greeterAtual.greet(nomeAtual)
            if(indiceAtual == listaNomes.size - 1){
                indiceAtual = 0
            }else{
                indiceAtual++
            }
        }
        biding.btProximoGreeter.setOnClickListener {
            if(greeterAtual == greeter1){
                greeterAtual = greeter2
                biding.numGreeter.text = "2"
            }
            else if(greeterAtual== greeter2){
                greeterAtual= greeter3
                biding.numGreeter.text = "3"
            }else{
                biding.numGreeter.text = "1"
                greeterAtual = greeter1
            }
        }
    }
}