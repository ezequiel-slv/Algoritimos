package arquivos.exercicios

fun main(){
    //soma()
    //calculoArea()
    //identificacao()
    //salario()
    //celsiusToFahrenheit()
    //fahremheitToCelsius()
    //volumeLata()
    //gastoCombustivel()
    taxaAtraso()
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
    //pag 146
    //C ← ((F – 32) * 5) / 9
    print("Digite a temperatura em graus Fahrenheit: ")
    val f = readLine()!!.toInt()

    val c : Int = ((f - 32) * 5 / 9)
    println("Temperatura em Celsius: $c graus C")
}

fun volumeLata(){
    //pag 147
    print("Digite o valor do raio da circunferência da lata: ")
    val r = readLine()!!.toDouble()

    print("Digite a altura da lata em centimetros: ")
    val altura = readLine()!!.toDouble()

    val volume : Double = 3.14159 * (r * r) * altura
    println("Volume: %.2f".format(volume) + " m³")
}

fun gastoCombustivel(){
    //pag 147
    //DISTÂNCIA ← TEMPO * VELOCIDADE
    print("Digite o tempo gasto em horas na viagem: ")
    val tempo = readLine()!!.toDouble()

    print("Digite a velocidade média do carro em km/h: ")
    val velocidade = readLine()!!.toDouble()

    val distancia : Double = tempo * velocidade

    val litrosUsados : Double = distancia / 12
    println("Litros gastos na viagem. %.1f".format(litrosUsados) )
}

fun taxaAtraso(){
    //PRESTAÇÃO ← VALOR + (VALOR * (TAXA / 100) * TEMPO)
    print("Digite o valor da prestação; ")
    val valor = readLine()!!.toDouble()

    print("Digite os meses de atraso: ")
    val tempo =  readLine()!!.toInt()

    val taxa = 0.05

    val prestacaoAtrasada : Double = valor + (valor * (taxa) * tempo)
    println("Prestação com taxa de atraso: $prestacaoAtrasada")
}