package com.example.meuprimeiroapp

class Greeter {
    private var prefixo = ""
    private var sufixo = ""
    private var inicio = ""
    private var parte1 = ""
    private var parte2 = ""
    private var parte3 = ""

    constructor(prefixo: String, sufixo:String){
        this.prefixo = prefixo
        this.sufixo = sufixo
    }
    constructor(parte1 :String, parte2: String, Parte3:String){
        this.parte1 = parte1
        this.parte2 = parte2
        this.parte3 = parte3
    }

constructor(inicio: String){
    this.inicio = inicio
}


    fun greet(nome: String): String{
        var cumprimento: String = "$prefixo $nome $sufixo"
        return cumprimento
    }
    fun greet2 (pessoa1 : PessoaGreeter): String{
        return "$parte1: ${pessoa1.nome} $parte2 : ${pessoa1.profissão} $parte3: ${pessoa1.telefone}"

    }
    fun greet3 ( pessoa: PessoaGreeter): String {
        val cumprimento = "$prefixo ${pessoa.nome} $sufixo: ${pessoa.idade}"
        return cumprimento
    }

}