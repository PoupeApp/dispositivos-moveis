package com.example.sorteio_numeros

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            sortearNumero()
        }
    }

    @SuppressLint("SetTextI18n")
    fun sortearNumero(){
        val resultado = Random().nextInt(11).toString()

        texto.setText("O número é $resultado")
    }
}
