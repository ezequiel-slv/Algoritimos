package arquivos

fun main(){
    soma()
    calculoArea()
    identificacao()
}

fun soma(){
    println("-----------")

    print("Digite o primeiro número: ")
    val a = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val b = readLine()!!.toInt()

    val x = a + b
    println(x)
}

fun calculoArea(){
    println("-----------")

    //formula: A = πR²
    //valor de pi: 3.14159265
    val pi = 3.14159265

    print("Digite ovalor do raio: ")
    val r = readLine()!!.toDouble()
5
    val a = pi * r * r
    println("Valor da área da circunferência: %.2f".format(a) + "M²")
}

fun identificacao(){
    println("-----------")

    print("Digite seu nome: ")
    val nome = readLine()!!

    println("Digite seu sexo: ")
    val sexo = readLine()!![0]

    println("Nome: $nome | Sexo: $sexo")

}