package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityGreeter2Binding

class Greeter2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityGreeter2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGreeter2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeter2)
        val Greeter1 = Greeter ("Nome", "Idade")
        val Greeter2 = Greeter ("Olá", "Sua idade é")
        val Greeter3 = Greeter ("Oi", "Vi que sua idade é ")
        val listaPessoa= mutableListOf<PessoaGreeter>()
        var indiceAtual = 0
        var greeterAtual = Greeter1
        binding.btSalvar.setOnClickListener {
            if (binding.txtNome.text.isNullOrBlank()||binding.txtIdade.text.isNullOrBlank()){
                binding.txtSaida.text = "Preencha todos os campos"
            }
            else{
                val nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            val idade = binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()
                val pessoa = PessoaGreeter(nome,idade)
                listaPessoa.add(pessoa)

        }
        }
        binding.btImprimirProximo.setOnClickListener {
            if (listaPessoa.size==0){
                binding.txtSaida.text = "Nenhum dado salvo"

            }else{
                val pessoaAtual = listaPessoa [indiceAtual]
                indiceAtual++
                //binding.txtSaida.text= greeterAtual.greet3(pessoaAtual)
                if (indiceAtual>= listaPessoa.size){
                    indiceAtual = 0
                }
            }
        }
        binding.btProximo.setOnClickListener {
            if (greeterAtual == Greeter1){
                binding.txtNumGreeter.text= "2"
                greeterAtual= Greeter2
            }else if (greeterAtual== Greeter2) {
                binding.txtNumGreeter.text = "3"
                greeterAtual = Greeter3
            }else{
                    binding.txtNumGreeter.text="1"
                greeterAtual= Greeter1
                }
            }
        }
    }
