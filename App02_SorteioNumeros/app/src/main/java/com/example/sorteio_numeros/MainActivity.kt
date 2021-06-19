package com.example.sorteio_numeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var texto : TextView
    private lateinit var botao : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.txtNumero)
        botao = findViewById(R.id.btnSortear)
        botao.setOnClickListener {
            SortearNumero()
        }
    }

    fun SortearNumero(){
        var resultado = Random().nextInt(11).toString()

        texto.text = "O número é $resultado"
    }
}
