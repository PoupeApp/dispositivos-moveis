package com.example.app06_shortbio

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var botaoSobre : Button
    private lateinit var botaoFormacao : Button
    private lateinit var botaoExperiencia : Button
    private lateinit var botaoObjetivo : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoSobre = findViewById(R.id.btnSobre)
        botaoFormacao = findViewById(R.id.btnFormacao)
        botaoExperiencia = findViewById(R.id.btnExperiencia)
        botaoObjetivo = findViewById(R.id.btnObjetivo)

        botaoSobre.setOnClickListener {
            val intentSobre = Intent(this@MainActivity, Sobre::class.java)
            startActivity(intentSobre)
        }

        botaoFormacao.setOnClickListener {
            val intentForm = Intent(this@MainActivity, Formacao::class.java)
            startActivity(intentForm)
        }

        botaoExperiencia.setOnClickListener {
            val intentExp = Intent(this@MainActivity, Experiencia::class.java)
            startActivity(intentExp)
        }

        botaoObjetivo.setOnClickListener {
            val intentObj = Intent(this@MainActivity, Objetivo::class.java)
            startActivity(intentObj)
        }
    }

}