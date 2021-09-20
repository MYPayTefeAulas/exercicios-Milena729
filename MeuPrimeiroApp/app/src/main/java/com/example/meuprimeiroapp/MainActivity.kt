package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)



        binding.Trocar.setOnClickListener{
//           Trocar()
//            trocar2()
//            calculaDobro()
          //  binding.txtHello.text = multiplica()
        }

        val view = binding.root
        setContentView(view)
    }
    fun Trocar (): String {
        return "Olá\nMilena"
    }
//    fun trocar2 (): String{
//       // return binding.txtAula.text.toString()
//    }
//    fun calculaDobro (): String {
//       // val textoEntrada = binding.txtAula.text.toString()
//        val numero = textoEntrada.toInt()
//        val dobro = numero * 2
//        return dobro.toString()
//    }
//    fun multiplica (): String {
//        val num1 = binding.input1.toString().toInt()
//        val num2 = binding.input2.toString().toInt()
//         val mult = num1 * num2
//        return mult.toString()
//    }
//    fun Calculadora (): String{
//  val operação = binding.input1.toString().toInt()
//        val numero1 = binding.
//        val numero2= bi
//    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
    }
//}