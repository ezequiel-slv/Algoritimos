package arquivos.exercicios

fun main(){
    distributiva()
    calculCaixaRetangular()
}

fun distributiva(){
    //pag 148
    val a  = 5
    val b  = 10
    val c  = 15
    val d  = 20

    val calculo = (a * b) + (a * c) + (a * d) + (b * c) + (b * d) + (c * d)

    println(calculo)
}

fun calculCaixaRetangular(){
    print("Digte o valor do comprimento da caixa: ")
    val comprimento = readLine()!!.toDouble()

    print("Digte o valor da largura da caixa: ")
    val largura = readLine()!!.toDouble()

    print("Digte o valor da altura da caixa: ")
    val altura = readLine()!!.toDouble()

    val volume  = comprimento * largura * altura

    println("Volume da caixa: $volume")


}