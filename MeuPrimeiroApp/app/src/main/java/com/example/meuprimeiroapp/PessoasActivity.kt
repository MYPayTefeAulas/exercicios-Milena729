package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityPessoasBinding


class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding
    private var nome = ""
    private var idade = 0
    val listaPessoas = mutableListOf<Pessoa>()
    private var indiceAtual = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPessoasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSalvar.setOnClickListener {
            if (binding.txtNome.text.isNullOrBlank() || binding.txtIdade.text.isNullOrBlank()) {
                binding.txtSaida.text = "Insira todos os dados"
            } else {
                binding.txtSaida.text = ""
                nome = binding.txtNome.text.toString()
                binding.txtNome.text.clear()
                binding.txtIdade.text.toString().toInt()
                binding.txtIdade.text.clear()
                val pessoa = Pessoa(nome, idade)
                listaPessoas.add(pessoa)

            }
        }
        binding.btProximo.setOnClickListener {
            binding.txtSaida.text= imprimePessoa()
        }
        binding.btzZerarLista.setOnClickListener {
            binding.txtSaida.text= ""
            listaPessoas.clear()
        }
    }


     fun imprimePessoa(): String{

         if (listaPessoas.size==0){
             return "Nenhum dado foi salvo"
         }
         if (indiceAtual>=listaPessoas.size){
             indiceAtual= 0
             return "Fim da lista"
         }
         val pessoalAtual = listaPessoas [indiceAtual]
         indiceAtual++
         return "Nome: ${pessoalAtual.nome}, idade ${pessoalAtual.idade}"
     }
}