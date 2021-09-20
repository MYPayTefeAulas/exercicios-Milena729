package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityCalculadoraBinding
import com.example.meuprimeiroapp.databinding.ActivityListasBinding

class CalculadoraActivity : AppCompatActivity() {
    private lateinit var biding: ActivityCalculadoraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        biding = ActivityCalculadoraBinding.inflate(layoutInflater)
        biding.btCalcular.setOnClickListener {
            biding.Resultado.text=calculadora()
        }

        super.onCreate(savedInstanceState)
        setContentView(biding.root)
    }
    fun calculadora () :String{
        val op = biding.operacao.text.toString()
        val num1 = biding.num1.text.toString().toFloat()
        val num2 = biding.num2.text.toString().toFloat()

        when(op){
            "+" -> return (num1+num2).toString()
            "-" -> return (num1-num2).toString()
            "/" -> return (num1/num2).toString()
            "*" -> return (num1*num2).toString()
            else -> return "Nenhuma operação escolhida"
        }
    }
}