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