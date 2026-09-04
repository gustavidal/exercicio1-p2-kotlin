//    19 -) Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo” (privado) e crie funções para depositar um valor, sacar um valor e para consultar o saldo
package model

class ContaBancaria {
    val nomeTitular: String = "Gustavo Vidal"
    private var saldo: Double = 0.0

    fun depositar(valor: Double): String {
        saldo += valor
        return "Olá, $nomeTitular! O valor de R$$valor foi depositado! O saldo atual é de R$$saldo!"
    }

    fun sacar(valor: Double): String {
        println(consultarSaldo())
        saldo -= valor
        return "Olá, $nomeTitular! O valor de R$$valor foi sacado! O saldo atual agora é de R$$saldo!"
    }

    fun consultarSaldo(): String {
        return "Olá, $nomeTitular! O saldo atual é de R$$saldo"
    }
}