fun main() {

    print("Digite um nome: ")
    val nome = readLine()
    println("Bem vindo: $nome")

    print("Digite sua senha: ")
    val senha = readLine()
    println("Senha: $senha")

    when (senha) {
        "123" ->  print("Senha correta: ")
        else -> print("Senha errada! ")
    }

    when (nome) {
        "Diego", "Danilo", "Japa", "Jhenifer", "Isac", "Pao", "Batata" -> println("Permitido")

        else -> println("Acesso bloqueado")
    }
}