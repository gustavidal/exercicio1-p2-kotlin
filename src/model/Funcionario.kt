// 20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a função que retorna o salário, retornando o salário com 20% de comissão (aumento)
package model

open class Funcionario {
    open val nome: String = "Gustavo Vidal"
    open var salario: Double = 1621.00

    open fun consultarSalario(): String {
        return "O funcionário $nome possui salário de R$$salario."
    }
}