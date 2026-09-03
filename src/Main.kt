import model.Pessoa

/*****************************************
 * Objetivo: Realizar exercícios de Kotlin
 * Data: 03/09/2026 (quinta-feira)
 * Autor: Gustavo Vidal de Abreu
 *****************************************/

fun main() {
//    12 -) Escreva um programa que conte de 1 a 100 e:
//    - Se for múltiplo de 3, mostre “Batata”
//    - Se for múltiplo de 5, mostre “Quente”
//    - Se for múltiplo de 3 e 5, mostre “BatataQuente”
    println("EXERCÍCIO 12")
    var lista = (1 .. 100).toList()
    for (i in lista) {
        val status = if (i % 15 == 0) {
            "BatataQuente"
        } else if (i % 5 == 0) {
            "Quente"
        } else if (i % 3 == 0) {
            "Batata"
        } else {""}
        println("$i = $status")
    }
    println("")


//    13 -) Dada uma lista de números, crie uma nova lista apenas com os ímpares
    println("EXERCÍCIO 13")
    var lista2 = (1 .. 100).toList()
    val impares = lista2.filter { numero ->
        numero % 2 == 1
    }
    println(impares)
    println("")

//    14 -) Dada uma lista de preços, calcule o total da compra
    println("EXERCÍCIO 14")
    var precos = arrayOf(15, 30, 55, 50, 100)
    val soma = precos.reduce { acumulador, numero -> acumulador + numero }
    println(soma)
    println("")

//    15 -) Dada uma lista de idades, calcule a média dos maiores de idade
    println("EXERCÍCIO 15")
    var idades = (13 .. 23).toList()
    val maiorDeIdade = idades.filter { numero -> numero >= 18 }
    val somaIdades = maiorDeIdade.reduce { acumulador, numero -> acumulador + numero }
    val mediaIdades = somaIdades / maiorDeIdade.size
    println(mediaIdades)
    println("")

//    16 -) Dada uma variável numérica, calcule o seu fatorial (ex: 5! = 5 * 4 * 3 * 2 * 1 = 120)
    println("EXERCÍCIO 16")
    var numero = 5
    var resultado = 1
    while (numero > 1) {
        resultado *= numero
        numero--
    }
    println(resultado)
    println("")

//    17 -) Crie um objeto “pessoa” com nome, idade e cidade, depois exiba uma frase com os dados do objeto por meio de um método: "Maria tem 25 anos e mora em São Paulo."
    println("EXERCÍCIO 17")
    val pessoa = Pessoa("Gustavo", 18, "Jandira")
    pessoa.apresentar()
    println("")

//    18 -) Crie um array de objetos representando produtos (nome, preço) e mostre o nome do produto mais caro
    println("EXERCÍCIO 18")

//    19 -) Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo” (privado) e crie funções para depositar um valor, sacar um valor e para consultar o saldo
    println("EXERCÍCIO 19")

//    20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a função que retorna o salário, retornando o salário com 20% de comissão (aumento)
    println("EXERCÍCIO 20")

}