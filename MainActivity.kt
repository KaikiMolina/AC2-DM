package com.example.ac2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.ac1.R
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Frase(view: View){
        var mensagem = findViewById<TextView>(R.id.txtMensagem)
        var biscoito = findViewById<ImageView>(R.id.imgAberto)
        var idMensagem = 0
        idMensagem = Random.nextInt(mensagens.size)
        mensagem.setText(mensagens[idMensagem])

        biscoito.setImageResource(R.drawable.fortunecookieopen)

        mensagens.random()
    }

    var mensagens = arrayOf(
        "1 – Agora é a hora de surpreender aqueles que duvidaram de você."

    "2 – Valorize as pequenas conquistas!",
    "3 – Você nunca será velho demais para sonhar um novo sonho.",
    "4 – Avante! Para começar, você só precisa dar o primeiro passo.",
    "5 – Para certas coisas, não basta querer, é preciso batalhar.",
    "6 – Abandone suas dores e não a esperança em dias melhores.",
    "7 – Lutar sempre, vencer às vezes, desistir nunca.",
    "8 – Que os dias bons se tornem rotina e os ruins se tornem raros.",
    "9 – Cada dificuldade ultrapassada te faz mais forte.",
    "10 – Seus medos morrerão de fome se você alimentar a sua motivação.",
    "11 – Abra-se para a coragem e vá atrás dos seus sonhos.",
    "12 – A vida retribui quem pensa positivo.",
    "13 – Tentar é a única maneira de saber se vai dar certo.",
    "14 – Você pode, se acreditar que pode.",
    "15 – Apenas você mesmo sabe a força que você possui.",
    "16 – Você pode ter resultados ou desculpas, mas não os dois.",
    "17 – O sucesso é a soma de pequenos esforços repetidos diariamente.",
    "18 – Não foque em ser ocupado, foque em ser produtivo.",
    "9 – Motivação é aquilo que te faz começar. Habito é aquilo que te faz continuar.",
    "20 – Já pensou que você já superou muitas dificuldades até aqui?",
    "21 – A influência das boas pessoas ninguém consegue apagar.",
    "22 – Mesmo que nem todo dia seja bom, há algo de bom todo dia.",
    "23 – O seu plano mais importante é você mesmo.",
    "24- Modificar-se faz parte da jornada da vida.",
    "25 – Mesmo que a jornada seja lenta, abrir mão não acelera.",
    "26 – Não faça sempre o mesmo se está procurando resultados diferentes.",
    "27 – É necessário abrir mão do comodismo de tempos em tempos.",
    "28 – Você só vai vencer amanhã se não desistir hoje.",
    "29 – Conceitos novos não circulam em mentes quadradas.",
    "30 – Você nunca fará nada se ficar esperando pelas situações perfeitas.",
    "31 – Não importa o que você decidiu. O que importa é que isso te faz feliz.",
    "32 – Quando pensar em desistir, lembre-se porque começou.",
    "33 – Se não puder fazer tudo, faça tudo que puder.",
    "34 – Comece onde você está. Use o que você tem. Faça o que puder.",
    "35 – Simplesmente viva a vida.",
    "36 – Que venham dias melhores.",
    "37 – O corpo alcança o que a mente acredita.",
    "38 – Hoje vai dar tudo certo.",
    "39 – Dias de luz sempre retornam para quem iluminado está.",
    "40 – Nem tudo na vida são flores, mas, quando for, regue.",
    "41 – Até o maior dos prédios começa no chão.",
    "42 – “Não sabendo que era impossível, foi lá e fez.”",
    "43 – Eu nasci para ser feliz, não para ser normal.",
    "44 – Ninguém é igual a você, e isso pode ser sua grande arma.",
    "45 – Jamais desista de ser feliz.",
    "46 – “Não chore porque acabou, sorria porque aconteceu.”",
    "47 – O melhor lugar do mundo é aqui e agora.",
    "48 – Acredite: tudo tem seu tempo.",
    "49 – Corra, viva, sonhe e alcance.",
    "50 – Seu maior medo também pode ser sua maior motivação."
    )
}