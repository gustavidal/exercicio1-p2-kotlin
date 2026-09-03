// 17 -) Crie um objeto “pessoa” com nome, idade e cidade, depois exiba uma frase com os dados do objeto por meio de um método: "Maria tem 25 anos e mora em São Paulo."
package model

class Pessoa(val nome: String, val idade: Int, val cidade: String) {
    fun apresentar() {
        println("$nome tem $idade anos e mora em $cidade.")
    }
}