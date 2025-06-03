package arquivos.exercicios

fun main(){
    //soma()
    //calculoArea()
    //identificacao()
    //salario()
    celsiusToFahrenheit()
    fahremheitToCelsius()
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

fun salario(){
    //pag 140
    print("Digite o valor da hora-aula: ")
    val ha = readLine()!!.toDouble()

    print("Digite o número de horas trabalhadas por mês: ")
    val ht = readLine()!!.toDouble()

    val pd = 0.2

    val sb = ht * ha
    val td = sb * pd

    val sl = sb - td

    println("Salário bruto: %.2f".format(sb))

    println("Total do desconto: %.2f".format(td))

    println("Salário liquido: %.2f".format(sl))
}



fun celsiusToFahrenheit(){
    //pag 146
    //Formula: F ← C * 9 / 5 + 32
    print("Digite a temperatura em graus Celsius: ")
    val c = readLine()!!.toInt()

    val f : Int = (c * 9 / 5) + 32

    println("Temperatura em Fahrenheit: $f graus F")
}

fun fahremheitToCelsius(){
    //C ← ((F – 32) * 5) / 9
    print("Digite a temperatura em graus Fahrenheit: ")
    val f = readLine()!!.toInt()

    val c : Int = ((f - 32) * 5 / 9)
    println("Temperatura em Celsius: $c graus C")
}