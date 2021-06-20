package com.example.app04_alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("SpellCheckingInspection")
class MainActivity : AppCompatActivity() {

    private lateinit var resultadoOpcao : TextView
    private lateinit var calc : Button
    private var alcool: Float? = null
    private var gasolina: Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultadoOpcao = findViewById(R.id.txtResultado)
        calc = findViewById(R.id.btnCalcular)
        calc.setOnClickListener{
            alcool = findViewById<EditText>(R.id.txtAlcool).text.toString().toFloatOrNull()
            gasolina = findViewById<EditText>(R.id.txtGasolina).text.toString().toFloatOrNull()
            calcularMelhorOpcao(alcool,gasolina)
        }
    }

    private fun calcularMelhorOpcao(alc: Float?, gas: Float?){
        var calculo: Float
        var resultado = ""

        if (alc != null && gas != null) {
            calculo = alc.div(gas)

            if (calculo < 0.7)
                resultado = "A melhor opção é Álcool"
            if (calculo >= 0.7)
                resultado = "A melhor opção é Gasolina"
        }
        else
            resultado = "Operação inválida"

        resultadoOpcao.text = resultado
    }
}