fun main() {

    /* Grupo de código reutilizável que podemos chamar
    em qualquer lugar e em qualquer hora no nosso projeto.

     Temos fuções sem retorno e funções com retorno.

    */

    //Exemplo de função sem retorno:println("Oii, Karolyne!")
    //Exemplo de função comretorno: readLine()!!


    /*val vida = 20
    if (vida <= 0){
        println("Você está morto")
    }else if (vida <=5){
        println("Você está morrendo")
    }else if( vida <= 8){
        println("Voce está bem!")
    }else{
       println("Você está ótimo")
    }

    fun nome (parametros): Tipo {
    Bloco que a função executará
    }
     */
    //Chamando a função statusJogador
    /*status
    hp -= 3
    status(hp)
    status(50)*/

    //Exemplo de função sem retorno utilizando parâmetros
   /* var vida = 10



    vida -= 3


    fun status(vida: Int){

        if (vida <= 0){
            println("Você está morto")
        }else if (vida <=5){
            println("Você está morrendo")
        }else if( vida <= 8){
            println("Voce está bem!")
        }else{
            println("Você está ótimo")
        }
    }
}*/

    //Exemplo de função sem retorno sem parâmetros
    /*fun escreverOi(){
        println("oi")
    }*/

    /*Funções com retorno vão servir  para a gente guardar o valor que a
    função retornar dentro de uma variável ou simplesmente exibir esse
    valor dentro de, por exemplo, um println() */

      /*var hp = 10
      var inimigo1Dano = 3


     hp = dano(hp, inimigo1Dano)
      println(hp)

      fun dano (vida: Int, dano: Int): Int{
          val calc = vida - dano
          status(calc)
          return calc

    println("O personagem levou $inimigo1Dano e ficou com " +
    "${dano(hp, inimigo1Dano)} de vida")

    }*/

    print("Digite o seu nome para ver ele em letras maiúsculas: ")
    val nome = readLine()!!

    print("O seu nome em letras maisuclas é: ${letrasMaiusculas(nome)}")

    /*: Fazer uma calculadora utilizando funções para cada operação matemática:

Adição
Subtração
Multiplicação
Divisão
*/
}

fun letrasMaiusculas(nome: String): String{
    return nome.uppercase()
}