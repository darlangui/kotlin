package com.example.test_in_kotlin
import com.example.test_in_kotlin.Car
import kotlin.reflect.typeOf

/*
Crie uma variável `nome` do tipo `String` e uma variável `idade` do tipo `Int`.
Atribua valores a elas e imprima uma mensagem dizendo
"Meu nome é [nome] e eu tenho [idade] anos"
*/

/*
Escreva uma função chamada `soma` que receba dois números inteiros como parâmetros e retorne
 a soma deles. Em seguida, chame essa função e imprima o resultado.
*/

fun soma(x: Int, y: Int): Int{
    return x + y
}

fun main() {
    val nome: String = "Darlan" // imutavel
    val idade: Int = 21 // imutavel
    var test: Any // nao tem tipo atribuido
    // nome = "teste"; -> Error var connot resigned

    println("Meu nome é $nome e eu tenho $idade anos")

    val result = soma(1,12)
    println("Resultado é $result")

    val car = Car("Fiat", "Uno", 2014) // inicializa uma class
    println(car.detalhes()) // chama um metodo

    // verificação com is
    if (idade is Int) {
        println("é inteiro")
    }
    test = 12.5f

    if(test is Float){
        println("test is int")
    }

    test = 12.5

    if(test is Double){
        println("test is Double")
    }

    if (car is Car){
        println("car é da classe Car")
    }

    println(car::class.simpleName ?: "Error") // retorna o nome da class
}