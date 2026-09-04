// 20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a função que retorna o salário, retornando o salário com 20% de comissão (aumento)
package model

class Gerente: Funcionario() {
    override val nome: String = "Kauan Alves"

    val funcionario = Funcionario()
    override var salario: Double = funcionario.salario * 1.2
    val salarioFormatado : String  = String.format("%.2f", salario).replace(',', '.')

    override fun consultarSalario(): String {
        return "O gerente $nome possui salário de R$$salarioFormatado."
    }
}