package com.example.meuprimeiroapp

class PessoaGreeter {
    var nome = ""
    var idade = 0
    var profissão = ""
    var telefone = ""

    constructor(nome: String, profissão : String, telefone: String){
        this.nome= nome
        this.profissão= profissão
        this.telefone= telefone
    }
    constructor(nome: String, idade: Int){
        this.nome = nome
        this.idade = idade
    }

}