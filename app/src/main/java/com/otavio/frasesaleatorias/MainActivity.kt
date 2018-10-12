package com.otavio.frasesaleatorias

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var textoFrase: TextView
    lateinit var botaoGerarFrases: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textoFrase = findViewById(R.id.txtFrase) as TextView
        botaoGerarFrases = findViewById(R.id.button) as Button


        botaoGerarFrases.setOnClickListener(View.OnClickListener {
            gerarFrases()
        })



    }


    fun gerarFrases() {

        val frases = listOf("Vamos colocar um sorriso nesse rosto.",
                "A loucura é como a gravidade, só precisa de um empurrãozinho...",
                "Tem pessoas que deviam comer maquiagem pra ver se ficam mais bonitas por dentro.",
                "Você pode se vingar do mal, sem se tornar parte dele?",
                "Se você é bom em alguma coisa, nunca a faça de graça.")

        val totalItensArray = frases.size
        var random = Random()

        var fraseAleatoria = random.nextInt(totalItensArray)

        textoFrase.setText(frases[fraseAleatoria])



    }
}
