package com.example.test_in_kotlin

/*
Crie uma classe chamada `Carro` com propriedades `marca`, `modelo` e `ano`.
Adicione um método `detalhes` que retorne uma string com essas informações.
Crie um objeto `meuCarro` dessa classe e imprima os detalhes.
*/
class Car(val marca: String, val modelo: String, val ano: Int) {
    val tempodeuso = 2024 - ano

    fun detalhes(): String {
        return "Marca: $marca, Modelo: $modelo, Uso: $tempodeuso, Ano: $ano"
    }
}

/*
Crie uma classe `Animal` com um método `som` que imprime "Som de animal".
Crie uma classe `Gato` que herda de `Animal` e sobrescreve o método `som` para imprimir "Miau".
 Crie um objeto `meuGato` e chame o método `som`
*/

open class Animal(val nome: String){
    open fun som(): String{
       return "Som de animal"
    }
}

class Gato(nome: String) : Animal(nome) {
    override fun som(): String{
        return "Miauuu"
    }
}

